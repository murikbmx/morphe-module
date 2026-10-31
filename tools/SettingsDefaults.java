import com.android.tools.smali.dexlib2.DexFileFactory;
import com.android.tools.smali.dexlib2.Opcode;
import com.android.tools.smali.dexlib2.Opcodes;
import com.android.tools.smali.dexlib2.builder.BuilderInstruction;
import com.android.tools.smali.dexlib2.builder.MutableMethodImplementation;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction11x;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21c;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21s;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction31i;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction32x;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c;
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction3rc;
import com.android.tools.smali.dexlib2.iface.Field;
import com.android.tools.smali.dexlib2.dexbacked.DexBackedDexFile;
import com.android.tools.smali.dexlib2.iface.ClassDef;
import com.android.tools.smali.dexlib2.iface.Method;
import com.android.tools.smali.dexlib2.iface.MethodImplementation;
import com.android.tools.smali.dexlib2.iface.TryBlock;
import com.android.tools.smali.dexlib2.iface.debug.DebugItem;
import com.android.tools.smali.dexlib2.iface.instruction.Instruction;
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction;
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c;
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction3rc;
import com.android.tools.smali.dexlib2.iface.reference.FieldReference;
import com.android.tools.smali.dexlib2.iface.reference.MethodReference;
import com.android.tools.smali.dexlib2.iface.reference.StringReference;
import com.android.tools.smali.dexlib2.immutable.ImmutableClassDef;
import com.android.tools.smali.dexlib2.immutable.ImmutableDexFile;
import com.android.tools.smali.dexlib2.immutable.ImmutableMethod;
import com.android.tools.smali.dexlib2.immutable.reference.ImmutableFieldReference;
import com.android.tools.smali.dexlib2.immutable.reference.ImmutableMethodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Changes default values of Morphe settings inside an extension dex.
 *
 * Usage: java -cp dexlib2.jar SettingsDefaults.java in.dex out.dex key=value [key=value ...]
 *   key   - setting key, e.g. morphe_shorts_autoplay
 *   value - true/false for BooleanSetting, a number for IntegerSetting/LongSetting,
 *           an enum constant name for EnumSetting (e.g. PREMIUM), any text for StringSetting
 *
 * For every setting it finds "new XxxSetting(key, default, ...)" in a static initializer and,
 * right before the constructor call, saves the default-value register to a new spare register,
 * loads the wanted value into it, and restores the register after the call.
 * Other settings that share the same register are not affected.
 * Fails (exit code 1) if any requested key is not found.
 */
public class SettingsDefaults {
    private static final String SETTINGS_PKG = "Lapp/morphe/extension/shared/settings/";
    /** "Lpkg/Class;->FIELD" of every static field in the dex, to validate enum values. */
    private static final Set<String> STATIC_FIELDS = new HashSet<>();

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: SettingsDefaults in.dex out.dex key=value [key=value ...]");
            System.exit(2);
        }
        Map<String, String> wanted = new LinkedHashMap<>();
        for (int i = 2; i < args.length; i++) {
            int eq = args[i].indexOf('=');
            if (eq <= 0) throw new IllegalArgumentException("Bad argument: " + args[i]);
            wanted.put(args[i].substring(0, eq), args[i].substring(eq + 1));
        }

        DexBackedDexFile dex = DexFileFactory.loadDexFile(args[0], Opcodes.forDexVersion(38));
        for (ClassDef c : dex.getClasses())
            for (Field f : c.getStaticFields()) STATIC_FIELDS.add(c.getType() + "->" + f.getName());
        Map<String, String> done = new LinkedHashMap<>();
        List<ClassDef> classes = new ArrayList<>();
        for (ClassDef c : dex.getClasses()) {
            List<Method> methods = new ArrayList<>();
            boolean changed = false;
            for (Method m : c.getMethods()) {
                MethodImplementation impl = m.getImplementation();
                if (impl != null && m.getName().equals("<clinit>") && mentionsAny(impl, wanted)) {
                    MethodImplementation patched = patch(c.getType(), impl, wanted, done);
                    if (patched != null) {
                        methods.add(new ImmutableMethod(m.getDefiningClass(), m.getName(), m.getParameters(),
                                m.getReturnType(), m.getAccessFlags(), m.getAnnotations(),
                                m.getHiddenApiRestrictions(), patched));
                        changed = true;
                        continue;
                    }
                }
                methods.add(m);
            }
            if (changed) {
                classes.add(new ImmutableClassDef(c.getType(), c.getAccessFlags(), c.getSuperclass(),
                        c.getInterfaces(), c.getSourceFile(), c.getAnnotations(), c.getFields(), methods));
            } else {
                classes.add(c);
            }
        }

        List<String> missing = new ArrayList<>();
        for (String k : wanted.keySet()) if (!done.containsKey(k)) missing.add(k);
        if (!missing.isEmpty()) {
            System.err.println("Settings not found: " + missing);
            System.exit(1);
        }
        DexFileFactory.writeDexFile(args[1], new ImmutableDexFile(dex.getOpcodes(), classes));
        for (Map.Entry<String, String> e : done.entrySet()) System.out.println(e.getKey() + " -> " + e.getValue());
    }

    private static boolean mentionsAny(MethodImplementation impl, Map<String, String> wanted) {
        for (Instruction ins : impl.getInstructions()) {
            if (ins.getOpcode() == Opcode.CONST_STRING || ins.getOpcode() == Opcode.CONST_STRING_JUMBO) {
                String s = ((StringReference) ((ReferenceInstruction) ins).getReference()).getString();
                if (wanted.containsKey(s)) return true;
            }
        }
        return false;
    }

    private static int[] registers(Instruction ins) {
        if (ins instanceof Instruction35c) {
            Instruction35c i = (Instruction35c) ins;
            int[] all = {i.getRegisterC(), i.getRegisterD(), i.getRegisterE(), i.getRegisterF(), i.getRegisterG()};
            int[] r = new int[i.getRegisterCount()];
            System.arraycopy(all, 0, r, 0, r.length);
            return r;
        }
        if (ins instanceof Instruction3rc) {
            Instruction3rc i = (Instruction3rc) ins;
            int[] r = new int[i.getRegisterCount()];
            for (int k = 0; k < r.length; k++) r[k] = i.getStartRegister() + k;
            return r;
        }
        return null;
    }

    private static MethodImplementation patch(String owner, MethodImplementation impl,
                                              Map<String, String> wanted, Map<String, String> done) {
        MutableMethodImplementation mut = new MutableMethodImplementation(impl);
        final int spare = impl.getRegisterCount(); // static initializer has no parameters: a new top register is free
        boolean changed = false;

        List<BuilderInstruction> list = mut.getInstructions();
        String pendingKey = null;
        int pendingReg = -1;
        for (int idx = 0; idx < list.size(); idx++) {
            BuilderInstruction ins = list.get(idx);
            Opcode op = ins.getOpcode();
            if (op == Opcode.CONST_STRING || op == Opcode.CONST_STRING_JUMBO) {
                String s = ((StringReference) ((ReferenceInstruction) ins).getReference()).getString();
                if (wanted.containsKey(s) && !done.containsKey(s)) {
                    pendingKey = s;
                    pendingReg = ((OneRegisterInstruction) ins).getRegisterA();
                }
                continue;
            }
            if (pendingKey == null) continue;
            if (op != Opcode.INVOKE_DIRECT && op != Opcode.INVOKE_DIRECT_RANGE) continue;
            MethodReference mr = (MethodReference) ((ReferenceInstruction) ins).getReference();
            int[] regs = registers(ins);
            if (!mr.getName().equals("<init>") || regs == null || regs.length < 3 || regs[1] != pendingReg) continue;
            if (!mr.getDefiningClass().startsWith(SETTINGS_PKG) || !mr.getDefiningClass().endsWith("Setting;")) continue;

            String settingType = mr.getDefiningClass();
            String paramType = mr.getParameterTypes().get(1).toString();
            int valueReg = regs[2];
            String value = wanted.get(pendingKey);
            List<BuilderInstruction> load = loadValue(settingType, paramType, valueReg, value,
                    enumClassFor(list, idx, valueReg));

            List<BuilderInstruction> before = new ArrayList<>();
            before.add(new BuilderInstruction32x(Opcode.MOVE_OBJECT_16, spare, valueReg));
            before.addAll(load);
            for (int k = 0; k < before.size(); k++) mut.addInstruction(idx + k, before.get(k));
            int invokeIdx = idx + before.size();
            mut.addInstruction(invokeIdx + 1, new BuilderInstruction32x(Opcode.MOVE_OBJECT_16, valueReg, spare));
            idx = invokeIdx + 1;

            done.put(pendingKey, value + " (" + settingType.substring(SETTINGS_PKG.length(), settingType.length() - 1) + ")");
            changed = true;
            pendingKey = null;
            pendingReg = -1;
            list = mut.getInstructions();
        }
        if (!changed) return null;
        return new WithExtraRegister(mut, spare + 1);
    }

    /** The enum class of an EnumSetting default: taken from the sget-object that loads the original default. */
    private static String enumClassFor(List<BuilderInstruction> list, int invokeIdx, int reg) {
        for (int i = invokeIdx - 1; i >= 0 && i >= invokeIdx - 8; i--) {
            BuilderInstruction ins = list.get(i);
            if (ins.getOpcode() == Opcode.SGET_OBJECT && ((OneRegisterInstruction) ins).getRegisterA() == reg) {
                return ((FieldReference) ((ReferenceInstruction) ins).getReference()).getDefiningClass();
            }
        }
        return null;
    }

    private static List<BuilderInstruction> loadValue(String settingType, String paramType, int reg, String value, String enumClass) {
        List<BuilderInstruction> out = new ArrayList<>();
        String simple = settingType.substring(SETTINGS_PKG.length());
        switch (simple) {
            case "BooleanSetting;": {
                if (!value.equals("true") && !value.equals("false"))
                    throw new IllegalArgumentException("BooleanSetting needs true/false, got: " + value);
                out.add(new BuilderInstruction21c(Opcode.SGET_OBJECT, reg, new ImmutableFieldReference(
                        "Ljava/lang/Boolean;", value.equals("true") ? "TRUE" : "FALSE", "Ljava/lang/Boolean;")));
                break;
            }
            case "IntegerSetting;": {
                int v = Integer.parseInt(value);
                if (v >= Short.MIN_VALUE && v <= Short.MAX_VALUE) out.add(new BuilderInstruction21s(Opcode.CONST_16, reg, v));
                else out.add(new BuilderInstruction31i(Opcode.CONST, reg, v));
                ImmutableMethodReference valueOf = new ImmutableMethodReference(
                        "Ljava/lang/Integer;", "valueOf", List.of("I"), "Ljava/lang/Integer;");
                if (reg < 16) out.add(new BuilderInstruction35c(Opcode.INVOKE_STATIC, 1, reg, 0, 0, 0, 0, valueOf));
                else out.add(new BuilderInstruction3rc(Opcode.INVOKE_STATIC_RANGE, reg, 1, valueOf));
                out.add(new BuilderInstruction11x(Opcode.MOVE_RESULT_OBJECT, reg));
                break;
            }
            case "EnumSetting;": {
                if (enumClass == null) throw new IllegalStateException("Could not detect enum class for value " + value);
                if (!STATIC_FIELDS.contains(enumClass + "->" + value))
                    throw new IllegalArgumentException("Enum " + enumClass + " has no value " + value);
                out.add(new BuilderInstruction21c(Opcode.SGET_OBJECT, reg, new ImmutableFieldReference(enumClass, value, enumClass)));
                break;
            }
            default:
                throw new IllegalArgumentException("Unsupported setting type " + settingType + " (param " + paramType + ")");
        }
        return out;
    }

    /** Same implementation, one more register. */
    private static final class WithExtraRegister implements MethodImplementation {
        private final MutableMethodImplementation impl;
        private final int registers;

        WithExtraRegister(MutableMethodImplementation impl, int registers) {
            this.impl = impl;
            this.registers = registers;
        }

        @Override public int getRegisterCount() { return registers; }
        @Override public Iterable<? extends Instruction> getInstructions() { return impl.getInstructions(); }
        @Override public List<? extends TryBlock<? extends com.android.tools.smali.dexlib2.iface.ExceptionHandler>> getTryBlocks() { return impl.getTryBlocks(); }
        @Override public Iterable<? extends DebugItem> getDebugItems() { return impl.getDebugItems(); }
    }
}

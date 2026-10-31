#!/usr/bin/env bash
# Creates your own signing key for the non-root APK (BKS keystore, as Morphe CLI expects).
# Run once, then put the printed values into GitHub secrets. Keep the keystore file safe:
# APKs signed with a different key can't be installed as an update over the old ones.
#
# Usage: scripts/make-keystore.sh [alias]
# Needs: keytool (comes with Java), curl, base64. Set KEYTOOL=/path/to/keytool if it's not in PATH.

set -euo pipefail

ALIAS=${1:-morphe-module}
KEYTOOL=${KEYTOOL:-keytool}
OUT_DIR=${OUT_DIR:-$HOME/morphe-module-keystore}
BC_VER=1.78.1
BC_JAR="$OUT_DIR/bcprov-jdk18on-${BC_VER}.jar"
KS="$OUT_DIR/release.keystore"

command -v "$KEYTOOL" >/dev/null || { echo "keytool not found. Install Java or set KEYTOOL=/path/to/keytool" >&2; exit 1; }
if [ -e "$KS" ]; then echo "$KS already exists, not overwriting" >&2; exit 1; fi
mkdir -p "$OUT_DIR"
chmod 700 "$OUT_DIR"

if [ ! -f "$BC_JAR" ]; then
	echo "Downloading BouncyCastle provider ${BC_VER} (needed for the BKS format)..."
	curl -fsSL -o "$BC_JAR" "https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk18on/${BC_VER}/bcprov-jdk18on-${BC_VER}.jar"
fi

# alphanumeric only: the build passes it through the shell
PASS=$(set +o pipefail; LC_ALL=C tr -dc 'A-Za-z0-9' </dev/urandom | head -c 32)

"$KEYTOOL" -genkeypair -alias "$ALIAS" -keyalg RSA -keysize 4096 -validity 36500 \
	-dname "CN=${ALIAS}" -keystore "$KS" -storetype BKS -storepass "$PASS" -keypass "$PASS" \
	-providerpath "$BC_JAR" -provider org.bouncycastle.jce.provider.BouncyCastleProvider >/dev/null

base64 -w0 "$KS" >"$OUT_DIR/KEYSTORE_BASE64.txt"
printf '%s' "$PASS" >"$OUT_DIR/KEYSTORE_PASSWORD.txt"
printf '%s' "$ALIAS" >"$OUT_DIR/KEYSTORE_ALIAS.txt"
chmod 600 "$OUT_DIR"/*

cat <<EOF

Keystore created: $KS
Back it up somewhere safe. Do NOT commit it.

Add these repository secrets (Settings -> Secrets and variables -> Actions -> New repository secret):
  KEYSTORE_BASE64    contents of $OUT_DIR/KEYSTORE_BASE64.txt
  KEYSTORE_PASSWORD  contents of $OUT_DIR/KEYSTORE_PASSWORD.txt
  KEYSTORE_ALIAS     contents of $OUT_DIR/KEYSTORE_ALIAS.txt

Or with GitHub CLI, from the repository folder:
  gh secret set KEYSTORE_BASE64 <"$OUT_DIR/KEYSTORE_BASE64.txt"
  gh secret set KEYSTORE_PASSWORD <"$OUT_DIR/KEYSTORE_PASSWORD.txt"
  gh secret set KEYSTORE_ALIAS <"$OUT_DIR/KEYSTORE_ALIAS.txt"
EOF

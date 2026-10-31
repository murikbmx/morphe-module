# Morphe Dual VoT Module

[![CI](https://github.com/murikbmx/morphe-module/actions/workflows/ci.yml/badge.svg?event=schedule)](https://github.com/murikbmx/morphe-module/actions/workflows/ci.yml)

Magisk / KernelSU / APatch module and non-root APK for **YouTube (arm64-v8a)** patched with
[**dual-vot-patches**](https://github.com/sashade8-ship-it/dual-vot-patches): Morphe patches
plus Google/other and Yandex voice-over translation in one bundle.

Get the [latest release](../../releases).

## Features
- Morphe patches + `Voice over translation` + `Yandex voice-over translation`
- Picks the newest YouTube version supported by the patches (`version = "auto"`)
- Morphe settings with custom defaults (`settings-defaults` in `config.toml`), can still be changed in the app:
  header logo **Premium**, **Shorts autoplay** on, default video and Shorts quality on Wi-Fi **1080p**
- Daily CI: rebuilds automatically when a new dual-vot-patches release appears
- Module updates through the Magisk/KernelSU manager (`updateJson`)
- Module:
  - installs the matching stock YouTube version itself if needed
  - mounts the patched apk from `/data/adb/rvhc` (not from the modules dir) to avoid root detection
  - recompiles odex (`speed-profile`) after install
  - action button in the root manager to enable/disable mounting

Non-root APK: install [MicroG-RE](https://github.com/MorpheApp/MicroG-RE/releases) first, then the `youtube-dualvot-v*.apk` from the release.
It installs next to the original YouTube (different package name), no root needed.

Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach YouTube from the Play Store.
If you see "Reflash needed" after reboots, try [rvmm-zygisk-mount](https://github.com/j-hc/rvmm-zygisk-mount).

## Configuration
Everything is in [`config.toml`](./config.toml). See [`CONFIG.md`](./CONFIG.md) for all options.

- `patches-version = "dev"` to build from dual-vot pre-releases
- `build-mode = "module"` or `"apk"` to build only one of them (default `both`)
- `excluded-patches` / `included-patches` / `patcher-args` to tune patches

## Building
### GitHub Actions
Two channels in two branches, two separate modules (install only one of them):

| | Stable | Dev |
|---|---|---|
| Branch | `main` (default) | `dev` |
| Module id | `youtube-dualvot-arm64` | `youtube-dualvot-dev-arm64` |
| Patches | latest stable dual-vot-patches release | newest release including pre-releases |
| Builds | daily [CI](../../actions/workflows/ci.yml) when a new release is out + manual | manual only |
| GitHub release | marked as latest | marked as pre-release, title ends with `(dev)` |
| Update channel | `update` branch | `update-dev` branch |

Manual run: Actions → **Build Modules** → **Run workflow** → pick the branch (`main` or `dev`).

Stock YouTube is downloaded from APKMirror (fallbacks: Uptodown, then archive.org), patches from dual-vot-patches releases.
Old releases are deleted automatically: the last 10 stable and 5 dev releases are kept.
Each build creates a GitHub release titled `YouTube <version> · Dual VoT <patches version>`
with a changelog (YouTube version, patches/CLI versions and the patches release notes).
Workflow permissions must allow write access (Settings → Actions → General → Workflow permissions).

### Own signing key (non-root APK)
Without it, APKs are signed with the public key from this repo, so anyone could make an "update" for your APK.
1. Run `scripts/make-keystore.sh` once (needs Java `keytool`). It creates `~/morphe-module-keystore/release.keystore`.
2. Add the printed `KEYSTORE_BASE64`, `KEYSTORE_PASSWORD`, `KEYSTORE_ALIAS` as repository secrets.
3. Back up the keystore. If you lose it, users will have to uninstall the APK to install new builds.

### Locally (Linux)
Requires `bash`, `jq`, `zip`, `curl`, `java` 21.
```console
$ git clone https://github.com/murikbmx/morphe-module --depth 1
$ cd morphe-module
$ ./build.sh
```
Output goes to `build/`. Local builds don't embed `updateJson`.

## Credits
Based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module) by j-hc.
Patches by [sashade8-ship-it/dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches) and [MorpheApp](https://github.com/MorpheApp/morphe-patches).

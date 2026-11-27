ProtonVPN: 5.21.57.0  

Non-root APK requires [MicroG-RE 7.4.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.4.0)  
MicroG-RE for arm64-v8a: [microg-7.4.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.4.0/microg-7.4.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.89.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.89.0)

<details><summary>Patches release notes (v1.89.0)</summary>

## [1.89.0](https://github.com/hxreborn/morphe-patches/compare/v1.88.0...v1.89.0) (2026-11-27)

### Bug Fixes

* **MovieBox - Unlock premium:** restore 720p and 1080p downloads ([2048db6](https://github.com/hxreborn/morphe-patches/commit/2048db6d3bdb56e153a75ab1195370605f87a65f)), closes [#1086](https://github.com/hxreborn/morphe-patches/issues/1086)
* **MovieBox:** adapt to 25/11/2026 backend changes ([081f528](https://github.com/hxreborn/morphe-patches/commit/081f52829a29f1c6ea4979dba9d7bea0c7b46009))
* **MuscleWiki - Unlock premium:** open Strength Level tool ([186521a](https://github.com/hxreborn/morphe-patches/commit/186521a0d12df5fd973e15ad2d00ccf913721a4f))
* **Nara Baby - Unlock premium:** remove lifetime sale banner ([5097182](https://github.com/hxreborn/morphe-patches/commit/5097182eb5b1014b1bb186d77d4c8184115b46fa))
* **Proton VPN:** resolve resource IDs for each APK ([f8fb226](https://github.com/hxreborn/morphe-patches/commit/f8fb226e47b25131cd21d5b7c38b172c28a159a4))
* **TradingView - Unlock chart features:** restore bar replay ([8894610](https://github.com/hxreborn/morphe-patches/commit/8894610fa3417815638547e694ee0e629bade985)), closes [#1077](https://github.com/hxreborn/morphe-patches/issues/1077)
* **VLLO:** remove 13.9.0, 13.9.6 and 13.9.18 app targets ([f48fa17](https://github.com/hxreborn/morphe-patches/commit/f48fa17caaccdf4dca42338116751a553a87e0b5))
* **Yuka - Sign-in token:** allow sign-in in cloned installs ([e63defa](https://github.com/hxreborn/morphe-patches/commit/e63defa03dbfdb6709f0d155579e14594822e095))

### New Features

* **Audiomack - Export downloaded songs:** add cover art to saved songs ([49fc8de](https://github.com/hxreborn/morphe-patches/commit/49fc8de7df77e57afe24bd21950a34b12a6b2aeb)), closes [#1078](https://github.com/hxreborn/morphe-patches/issues/1078)
* **Citra - Remove ads:** remove ads from games ([b387374](https://github.com/hxreborn/morphe-patches/commit/b3873748cec4a1655ab5595b5152a3fdd610ea40))
* **Clip Studio Paint - Lower Android requirement:** run on Android 12 ([4ac098b](https://github.com/hxreborn/morphe-patches/commit/4ac098b1eb9a14c0d39d04dfe83a45ddac18b4b3)), closes [#1083](https://github.com/hxreborn/morphe-patches/issues/1083)
* **ExifTool - Remove ads:** hide banner, interstitial and app-open ads ([9bd6eac](https://github.com/hxreborn/morphe-patches/commit/9bd6eac7f497e6f9502c77fd0303c9f42eebc4cb))
* **ExifTool - Unlock premium:** unlock editing, watermarks and map pins ([f9e9024](https://github.com/hxreborn/morphe-patches/commit/f9e9024bbb68c62fcaec357e20d92faab1b2caed))
* **Filmish - Unlock premium:** unlock Pro tools, remove watermark ([d8461c5](https://github.com/hxreborn/morphe-patches/commit/d8461c5daeaaf57ef075cb89be500d35714c0aff))
* **GSMArena - Remove ads:** hide banner, interstitial and sponsor ads ([4419189](https://github.com/hxreborn/morphe-patches/commit/441918963838da28b43cfcd69bf893ad470c2cc0))
* **Hourly Chime - Unlock premium:** unlock chime options and remove ads ([4e5583f](https://github.com/hxreborn/morphe-patches/commit/4e5583fc036cccb8ddb2efd2eda1494cf9282745))
* **Magic Poser - Disable tracking:** stop analytics events ([2788528](https://github.com/hxreborn/morphe-patches/commit/2788528158804764da796eb5ca903a06992d6857))
* **Magic Poser - Unlock premium:** unlock Pro and Master features ([90c9c1a](https://github.com/hxreborn/morphe-patches/commit/90c9c1a6d8892523b449798b7b99d6c9fa646c1c))
* **MuscleWiki - Clone routines:** add Duplicate to routine menus ([b0a25be](https://github.com/hxreborn/morphe-patches/commit/b0a25be0fe8dd9332ff8324c2822142de0165f0d)), closes [#1064](https://github.com/hxreborn/morphe-patches/issues/1064)
* **Nara Baby - Remove rating prompts:** hide Play Store rating bar ([84bd8ba](https://github.com/hxreborn/morphe-patches/commit/84bd8ba2bceb30951174df41aa5167c7880f676e))
* **one sec - Unlock Pro:** block unlimited apps and in-app distractions ([467ce36](https://github.com/hxreborn/morphe-patches/commit/467ce36e4374e7177a28a3c32322ea845df9ba17))
* **Patreon - Hide recommended creators:** filter posts below a post ([a5fd792](https://github.com/hxreborn/morphe-patches/commit/a5fd792067a86075c80a11da69f35503449c0592)), closes [#1079](https://github.com/hxreborn/morphe-patches/issues/1079)
* **PCAPdroid - Unlock premium:** unlock firewall, malware scans, Pcapng ([6402483](https://github.com/hxreborn/morphe-patches/commit/6402483cdbb382b019475066691634b089b6060d))
* **Proton VPN - Enable guest mode:** add guest option to welcome screen ([78e9ad6](https://github.com/hxreborn/morphe-patches/commit/78e9ad6e9fcf50435436bdc3a44d44176ef4257d)), closes [#1088](https://github.com/hxreborn/morphe-patches/issues/1088)
* **TradingView - Unlock chart features:** run long scripts in replay ([8140dc8](https://github.com/hxreborn/morphe-patches/commit/8140dc89e789397a6e3d71377f52e8be26440968))
* **Viber - Ignore accents in contact search:** match plain spellings ([3e6a277](https://github.com/hxreborn/morphe-patches/commit/3e6a27776bcb37601e4990b295f7b8fddc0d0cbb)), closes [#1091](https://github.com/hxreborn/morphe-patches/issues/1091)
* **VLLO:** support 14.0.2 ([a0c274b](https://github.com/hxreborn/morphe-patches/commit/a0c274bca81f373e70f5c8ab84800495a1fad05c)), closes [#855](https://github.com/hxreborn/morphe-patches/issues/855)
* **VoCat - Unlock premium:** unlock FSRS and widget, remove ads ([6b866ca](https://github.com/hxreborn/morphe-patches/commit/6b866caf298edd96ccea08874642386491cd599d))
* **Yuka - Hide Search tab:** remove locked search from bottom bar ([ef5cf7a](https://github.com/hxreborn/morphe-patches/commit/ef5cf7a7986f44ede33eb12ae0f94941732ea5e6))
* **ZArchiver - Archive image thumbnails:** show previews in file list ([527dc0c](https://github.com/hxreborn/morphe-patches/commit/527dc0ce8aca13a272529bb3716dbbb7adbaf6c1))
* **ZArchiver - Edit files in archives:** save changes inside archives ([e6a3a60](https://github.com/hxreborn/morphe-patches/commit/e6a3a6047cea3f8980d45411b306e20b0c172acd))
* **ZArchiver - Saved passwords:** fill archive password prompts ([24a9380](https://github.com/hxreborn/morphe-patches/commit/24a9380834b88bb85ba398a5c9cbe27a6f046842))
* **ZArchiver - Unlock themes:** offer six options under Interface ([4550803](https://github.com/hxreborn/morphe-patches/commit/4550803244db7ce60adebee845bb50a265af08b1))

### Updated App Support

* **Notein:** add support for `v2.1.56.0` ([763deb2](https://github.com/hxreborn/morphe-patches/commit/763deb2a312155da5fb556e7452d3634f8dd626d)), closes [#951](https://github.com/hxreborn/morphe-patches/issues/951)
* **TunnelDOOM VPN:** add support for `4.3.5` ([1e47ab1](https://github.com/hxreborn/morphe-patches/commit/1e47ab16542177cb9c78246587b77d6e003b44c8)), closes [#1026](https://github.com/hxreborn/morphe-patches/issues/1026)

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.4.0-all.jar    

Skipped:  
Gboard: jasonwu1994/Gboard-patches/patches-4.5.0.mpp
GooglePhotos: RookieEnough/De-Vanced/patches-1.6.4.mpp
YouTube: sashade8-ship-it/dual-vot-patches/patches-2.4.0-dualvot.8.5.4.mpp  

Без изменений, перенесено из релиза 31:  
- gboard-lite-kveld-v18.6.3.1002251336-lite_release-arm64-v8a.apk  
- gboard-wu-v18.5.4.993608717-release-arm64-v8a.apk  
- googlephotos-devanced-module-v7.92.0.977185651-arm64-v8a.zip  
- googlephotos-devanced-v7.92.0.977185651-arm64-v8a.apk  
- youtube-dualvot-module-v21.30.216-arm64-v8a.zip  
- youtube-dualvot-v21.30.216-arm64-v8a.apk  

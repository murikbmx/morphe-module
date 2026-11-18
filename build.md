ProtonVPN: 5.21.9.0  

Non-root APK requires [MicroG-RE 7.3.1](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.1)  
MicroG-RE for arm64-v8a: [microg-7.3.1-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.1/microg-7.3.1-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.82.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.82.0)

<details><summary>Patches release notes (v1.82.0)</summary>

## [1.82.0](https://github.com/hxreborn/morphe-patches/compare/v1.81.0...v1.82.0) (2026-11-18)

### Bug Fixes

* **Albo - Remove bulk import limit:** import links past the weekly limit ([dd33405](https://github.com/hxreborn/morphe-patches/commit/dd33405ca625d16142785302b42d7c14c75d7bf8)), closes [#932](https://github.com/hxreborn/morphe-patches/issues/932)
* **BeReal:** deliver push notifications to patched installs ([158d4b6](https://github.com/hxreborn/morphe-patches/commit/158d4b667f6412de2a6733b28feeba3ffa3263f3)), closes [#900](https://github.com/hxreborn/morphe-patches/issues/900)
* **DepthPix:** stop empty Home and unsupported version error ([a60117d](https://github.com/hxreborn/morphe-patches/commit/a60117d3519920fba8486335b1975a41e81c0880))

### New Features

* **Botim - Disable background logging:** remove extra launch process ([99b5bc8](https://github.com/hxreborn/morphe-patches/commit/99b5bc80f5cdde1bd53b03eca4a0901904400384)), closes [#917](https://github.com/hxreborn/morphe-patches/issues/917)
* **Botim - Hide All tab:** show bottom bar without services grid ([a2e02dd](https://github.com/hxreborn/morphe-patches/commit/a2e02ddbb3e4fb79146695ef855bf5f2128645d1))
* **Botim - Remove botim AI:** drop AI row from New chat and New call ([49beb21](https://github.com/hxreborn/morphe-patches/commit/49beb21114d907508ca790b2e246b6c4c8b2d483))
* **iVoox - Remove rating prompts:** stop 5-star request during playback ([5a2a794](https://github.com/hxreborn/morphe-patches/commit/5a2a794299751711baaa832f612dc91cfa4e60ae))
* **iVoox - Unlock premium:** remove ads and subscription offers ([e86a516](https://github.com/hxreborn/morphe-patches/commit/e86a516f133210cdc9edf9a462009220369e5b80))
* **TradingView - Unlock chart features:** lift 3-indicator chart limit ([519e95c](https://github.com/hxreborn/morphe-patches/commit/519e95cef829e3848bc502502616cba228767046)), closes [#928](https://github.com/hxreborn/morphe-patches/issues/928)

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.2.0-all.jar    

Skipped:  
Gboard: jasonwu1994/Gboard-patches/patches-4.3.0.mpp
GboardLite: kveld9/kveld-morphe-patches/patches-2.11.0.mpp
GooglePhotos: RookieEnough/De-Vanced/patches-1.6.4.mpp
YouTube: sashade8-ship-it/dual-vot-patches/patches-2.3.0-dualvot.8.5.4.mpp  

Без изменений, перенесено из релиза 26:  
- gboard-lite-kveld-v18.6.3.1002251336-lite_release-arm64-v8a.apk  
- gboard-wu-v18.5.4.993608717-release-arm64-v8a.apk  
- googlephotos-devanced-module-v7.92.0.977185651-arm64-v8a.zip  
- googlephotos-devanced-v7.92.0.977185651-arm64-v8a.apk  
- youtube-dualvot-module-v21.30.216-arm64-v8a.zip  
- youtube-dualvot-v21.30.216-arm64-v8a.apk  

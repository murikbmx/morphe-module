ProtonVPN: 5.21.57.0  

Non-root APK requires [MicroG-RE 7.4.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.4.0)  
MicroG-RE for arm64-v8a: [microg-7.4.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.4.0/microg-7.4.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.88.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.88.0)

<details><summary>Patches release notes (v1.88.0)</summary>

## [1.88.0](https://github.com/hxreborn/morphe-patches/compare/v1.87.0...v1.88.0) (2026-11-25)

### Bug Fixes

* **BetterSleep - Unlock premium:** stop crash on armeabi-v7a devices ([5624a4a](https://github.com/hxreborn/morphe-patches/commit/5624a4a9d4592592f9a91e72d1400fd35c38b35a)), closes [#797](https://github.com/hxreborn/morphe-patches/issues/797)
* **Duolingo:** remove `6.105.2` app target ([b853cf6](https://github.com/hxreborn/morphe-patches/commit/b853cf622b725e6a0da7394e7b7b6ff83f5c2b56))
* **MovieBox TV:** remove `1.2.0.0923.web_socialmedia` app target ([488042e](https://github.com/hxreborn/morphe-patches/commit/488042e9cb395c1289d27ca9e36b829ca37f4a47))
* **Outlook - Add custom themes:** color the header in dark mode ([9e7bbcc](https://github.com/hxreborn/morphe-patches/commit/9e7bbcc35a7f18b1ce587905f15c42d3357974e0))
* **Outlook - Fix sign-in:** sign in with work accounts ([b5b54d0](https://github.com/hxreborn/morphe-patches/commit/b5b54d0a40f5ec1e72dd72fb97242f531baf69c0))

### New Features

* **Audiomack - Export downloaded songs:** save and share tagged files ([a79d1f6](https://github.com/hxreborn/morphe-patches/commit/a79d1f675f35f523b4272931770cc1d176f5515a)), closes [#1070](https://github.com/hxreborn/morphe-patches/issues/1070)
* **Infinite Painter - Unlock premium:** use masks and patterns ([6d2ce01](https://github.com/hxreborn/morphe-patches/commit/6d2ce013b87c75aab3cbe09af8f67e6d970fcce7))
* **MovieBox TV - Custom skip length:** skip up to 10 minutes per press ([9783d70](https://github.com/hxreborn/morphe-patches/commit/9783d70ceade64a32b38fd389687157b85172adb))
* **MovieBox TV - Prefer highest resolution:** start playback at 1080p ([135dcd6](https://github.com/hxreborn/morphe-patches/commit/135dcd6bc5cfd18fb410aa0794a256e716be5a52))
* **Outlook - Add custom themes:** choose any color or photo as theme ([7a64962](https://github.com/hxreborn/morphe-patches/commit/7a64962387785126c2aff2d43c0e2c3bc5a3f199)), closes [#1046](https://github.com/hxreborn/morphe-patches/issues/1046)
* **Outlook - Hide navigation buttons:** hide Calendar, Apps or full bar ([e7eca62](https://github.com/hxreborn/morphe-patches/commit/e7eca625f6ec44bac31201b2dc902a2ea64d8987)), closes [#1045](https://github.com/hxreborn/morphe-patches/issues/1045)
* **Proton Pass - Remove free accounts limit:** add more free accounts ([271aee5](https://github.com/hxreborn/morphe-patches/commit/271aee5e99ad1373426e99b304e9a0ee1ec59db6)), closes [#1049](https://github.com/hxreborn/morphe-patches/issues/1049)
* **Viber - Explain Google Drive errors:** show fix in Drive errors ([bdefa77](https://github.com/hxreborn/morphe-patches/commit/bdefa773f5b07a16e20b43dabf441305dab51180))

### Updated App Support

* **Chess Scanner:** add support for `1.8.33` ([5ab1c86](https://github.com/hxreborn/morphe-patches/commit/5ab1c8689b1bd41f282e64ee19783b75e1937d37))
* **Duolingo:** add support for `6.106.6` ([10c5656](https://github.com/hxreborn/morphe-patches/commit/10c56569d9b1364162b4e3bb6d7a00fb0cb68c3b)), closes [#1048](https://github.com/hxreborn/morphe-patches/issues/1048)
* **MovieBox TV:** add support for `1.2.3.1113.03` ([38726da](https://github.com/hxreborn/morphe-patches/commit/38726da9c9534f5643aecdab9ea3118c5bb59bea))

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.3.0-all.jar    

Skipped:  
Gboard: jasonwu1994/Gboard-patches/patches-4.4.0.mpp
GooglePhotos: RookieEnough/De-Vanced/patches-1.6.4.mpp
YouTube: sashade8-ship-it/dual-vot-patches/patches-2.3.0-dualvot.8.5.4.mpp  

Без изменений, перенесено из релиза 31:  
- gboard-lite-kveld-v18.6.3.1002251336-lite_release-arm64-v8a.apk  
- gboard-wu-v18.5.4.993608717-release-arm64-v8a.apk  
- googlephotos-devanced-module-v7.92.0.977185651-arm64-v8a.zip  
- googlephotos-devanced-v7.92.0.977185651-arm64-v8a.apk  
- youtube-dualvot-module-v21.30.216-arm64-v8a.zip  
- youtube-dualvot-v21.30.216-arm64-v8a.apk  

ProtonVPN: 5.21.57.0  

Non-root APK requires [MicroG-RE 7.3.2](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.2)  
MicroG-RE for arm64-v8a: [microg-7.3.2-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.2/microg-7.3.2-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.85.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.85.0)

<details><summary>Patches release notes (v1.85.0)</summary>

## [1.85.0](https://github.com/hxreborn/morphe-patches/compare/v1.84.0...v1.85.0) (2026-11-21)

### Bug Fixes

* **AliExpress:** skip missing icons in patches settings ([c472350](https://github.com/hxreborn/morphe-patches/commit/c47235045ee4a6b0b356fc2ad51366cafddf899c))
* apply code inspection fixes to shared extension code ([190dd4d](https://github.com/hxreborn/morphe-patches/commit/190dd4dd18d843d7a87c645de3e97bed54aa2599))
* **BeReal:** keep stock behaviour when camera or post data is missing ([c6fe71f](https://github.com/hxreborn/morphe-patches/commit/c6fe71ff241ccc74a9454e145919b6a313f07508))
* **BitTorrent - Fix screen insets:** apply code inspection fixes ([f5893e1](https://github.com/hxreborn/morphe-patches/commit/f5893e15c4ea2a6107a20685428956313831e151))
* **Candy Crush Saga:** apply code inspection fixes ([481bceb](https://github.com/hxreborn/morphe-patches/commit/481bceba5f0148421eae8288018acd8d12c29f51))
* **Castle - Unlock premium:** apply code inspection fixes ([8e3e415](https://github.com/hxreborn/morphe-patches/commit/8e3e41598f340deff736eba8946b4125df55cc4f))
* **Cx File Explorer - Dark theme:** apply code inspection fixes ([8ec706d](https://github.com/hxreborn/morphe-patches/commit/8ec706d51b75dcd973ab92fe26a3f5718c882560))
* **Habitify - Unlock premium:** apply code inspection fixes ([afec76f](https://github.com/hxreborn/morphe-patches/commit/afec76f50c1d09fe48fc9fa49a455615d1dc135f))
* **Keepa - Multiple accounts:** apply code inspection fixes ([f237530](https://github.com/hxreborn/morphe-patches/commit/f237530f1504cf980e6beeabbb582ca5f349ab18))
* **Liftoff:** apply code inspection fixes ([d1437d4](https://github.com/hxreborn/morphe-patches/commit/d1437d44ff22e7233b778d1371b9740a8d1d1723))
* **Musicolet - Unlock premium:** show all Most Played periods ([222b496](https://github.com/hxreborn/morphe-patches/commit/222b496b6f8a2531844bc2725a8784269706bcc6)), closes [#973](https://github.com/hxreborn/morphe-patches/issues/973)
* **Musicolet - Unlock premium:** stop silent songs and empty Most Played ([5d0ae0f](https://github.com/hxreborn/morphe-patches/commit/5d0ae0f3de2f6fecb7d913eea72cceaa78ad3814)), closes [#973](https://github.com/hxreborn/morphe-patches/issues/973)
* **Muviz Widgets - Fix weather:** apply code inspection fixes ([cd7319f](https://github.com/hxreborn/morphe-patches/commit/cd7319fb400b87fab1584b36c682c9389565cb95))
* **Network Analyzer:** log network tool failures ([d9e8e0e](https://github.com/hxreborn/morphe-patches/commit/d9e8e0e9e388ef263e5f381811b6cc89912f7da9))
* **Photo Editor Pro:** log unreadable AI run history ([6e4a288](https://github.com/hxreborn/morphe-patches/commit/6e4a288fa8bd18a44483a1b46ff80caeff51e1da))
* **Proton:** apply code inspection fixes ([143913b](https://github.com/hxreborn/morphe-patches/commit/143913bfa54224824d94280b9f8085d526bb4b6d))
* **Pydroid 3 - AMOLED dark theme:** apply code inspection fixes ([a037630](https://github.com/hxreborn/morphe-patches/commit/a0376303199b51f36dcbaa55d023e3177a0615f8))
* **Quranify:** apply code inspection fixes ([272eb52](https://github.com/hxreborn/morphe-patches/commit/272eb523d04e08c282dd4b313e9c0614245e1e87))
* **Raindrop.io - Accent color:** log failed accent cache cleanup ([349a16b](https://github.com/hxreborn/morphe-patches/commit/349a16bc1e660836f768e58bfd64ff2c63515590))
* **ReadEra:** apply code inspection fixes ([2c7fea8](https://github.com/hxreborn/morphe-patches/commit/2c7fea8ebf0e8b16207f0eeb90118ce9e9fc4c5a))
* **TeraBox:** apply code inspection fixes ([c7e2ef1](https://github.com/hxreborn/morphe-patches/commit/c7e2ef12f7c567743f8ffca3af2080345a52e7ad))
* **ULTIMEA:** log unreadable equalizer presets ([f4571a2](https://github.com/hxreborn/morphe-patches/commit/f4571a27398cbebfaaf6c5b2c1670cf57c4175fa))
* **Viber:** apply code inspection fixes ([a2d10a8](https://github.com/hxreborn/morphe-patches/commit/a2d10a8ae4489e66ac62b167a84de13d9140c914))

### New Features

* **Public - Load videos on tap:** show thumbnails when Autoplay is off ([d21e017](https://github.com/hxreborn/morphe-patches/commit/d21e017033b28799d3672d3040d1409ed5f41da1)), closes [#770](https://github.com/hxreborn/morphe-patches/issues/770)
* **Public - Remove feed cards:** keep follow suggestions out of For You ([aced490](https://github.com/hxreborn/morphe-patches/commit/aced4904f60344d05a837cf638d888a23c9f6197))

### Updated App Support

* **Albo:** add support for `1.28.1` ([508cd5a](https://github.com/hxreborn/morphe-patches/commit/508cd5a989b6058e2e2332f4b2838f4cadb95bb4)), closes [#789](https://github.com/hxreborn/morphe-patches/issues/789)
* **Audiobook Unlimited for Kindle:** add support for `1.7.30` ([3bf689c](https://github.com/hxreborn/morphe-patches/commit/3bf689c51af1d9898420fa2f8359d295ddab68e5)), closes [#794](https://github.com/hxreborn/morphe-patches/issues/794)
* **BetterSleep:** add support for `26.20` ([2831917](https://github.com/hxreborn/morphe-patches/commit/2831917f30c32c948ad701a886ab632dd070a16f))
* **Biobird Flashcards:** add support for `4.0.0` ([7c41177](https://github.com/hxreborn/morphe-patches/commit/7c411775116ece9703090e20233d19845915bfa7)), closes [#798](https://github.com/hxreborn/morphe-patches/issues/798)
* **LingoDeer:** add support for `2.99.423` ([792dc73](https://github.com/hxreborn/morphe-patches/commit/792dc73398dd64beef42f4520e8e3c0e5004ecc9)), closes [#819](https://github.com/hxreborn/morphe-patches/issues/819)
* **ReadEra:** add support for `26.11.06+2360` ([d76a4e3](https://github.com/hxreborn/morphe-patches/commit/d76a4e32679576fb4d76d954620090b5b9048253)), closes [#842](https://github.com/hxreborn/morphe-patches/issues/842)
* **Resprite:** add support for `1.33.1` ([c2355fa](https://github.com/hxreborn/morphe-patches/commit/c2355fae331acae9400bd5735dd7dd7b4042f726)), closes [#843](https://github.com/hxreborn/morphe-patches/issues/843)
* **TeraBox:** add support for `4.29.0` ([1b19c28](https://github.com/hxreborn/morphe-patches/commit/1b19c28b36d50be9ee0b13e0cf61c92aa28d3939)), closes [#981](https://github.com/hxreborn/morphe-patches/issues/981)
* **Yuka:** add support for `5.9.1` ([ae4db85](https://github.com/hxreborn/morphe-patches/commit/ae4db85c18fdd47c2127c89a23edd1517a4359ea))

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.3.0-all.jar    

Skipped:  
Gboard: jasonwu1994/Gboard-patches/patches-4.3.0.mpp
GboardLite: kveld9/kveld-morphe-patches/patches-2.11.0.mpp
GooglePhotos: RookieEnough/De-Vanced/patches-1.6.4.mpp
YouTube: sashade8-ship-it/dual-vot-patches/patches-2.3.0-dualvot.8.5.4.mpp  

Без изменений, перенесено из релиза 31:  
- gboard-lite-kveld-v18.6.3.1002251336-lite_release-arm64-v8a.apk  
- gboard-wu-v18.5.4.993608717-release-arm64-v8a.apk  
- googlephotos-devanced-module-v7.92.0.977185651-arm64-v8a.zip  
- googlephotos-devanced-v7.92.0.977185651-arm64-v8a.apk  
- youtube-dualvot-module-v21.30.216-arm64-v8a.zip  
- youtube-dualvot-v21.30.216-arm64-v8a.apk  

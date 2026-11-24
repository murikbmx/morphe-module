ProtonVPN: 5.21.57.0  

Non-root APK requires [MicroG-RE 7.3.2](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.2)  
MicroG-RE for arm64-v8a: [microg-7.3.2-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.2/microg-7.3.2-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.86.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.86.0)

<details><summary>Patches release notes (v1.86.0)</summary>

## [1.86.0](https://github.com/hxreborn/morphe-patches/compare/v1.85.0...v1.86.0) (2026-11-23)

### Bug Fixes

* **BeReal:** open hosted patch screens only through their own host ([d525c02](https://github.com/hxreborn/morphe-patches/commit/d525c0262adb338e861761df39733c272c74d97f))
* **BeReal:** open patches screens on mount installs ([55a29ab](https://github.com/hxreborn/morphe-patches/commit/55a29ab5ce4d8777085ed90db5338a70d016f36b))
* **BeReal:** remove `3.97.1` app target ([6b9b080](https://github.com/hxreborn/morphe-patches/commit/6b9b080ed4cabf923bb10d64aa3d169d25f7ae4e))
* **BitTorrent, µTorrent, Viber:** skip restart prompt when reset fails ([6de70c3](https://github.com/hxreborn/morphe-patches/commit/6de70c3e9b4c79090c530cda3b6d62c4fd11e3ee))
* **Projectivy Launcher:** remove app support ([1cc5b83](https://github.com/hxreborn/morphe-patches/commit/1cc5b8356c7791f4286a3946741c4cb96a44f74c))
* **Ultimate Guitar - Unlock premium:** show subscription message ([c1ca1d9](https://github.com/hxreborn/morphe-patches/commit/c1ca1d9bd42fa95e4059c8e998756412eef50a91))
* **VPN Super Unlimited Proxy - Unlock premium:** stop tampering alert ([07d048a](https://github.com/hxreborn/morphe-patches/commit/07d048a48165f260723758704312ac3b3ae893a2)), closes [#983](https://github.com/hxreborn/morphe-patches/issues/983)

### New Features

* **BeReal - Custom BeFake header:** switch between BeReal and BeFake ([ef08135](https://github.com/hxreborn/morphe-patches/commit/ef08135014132a30974e33d041d39b0d48b4acfb))
* **TeraBox - Download generated files:** save chat files to Downloads ([849bace](https://github.com/hxreborn/morphe-patches/commit/849bace434e0652ef094ed6652fe93fc161d328a)), closes [#1016](https://github.com/hxreborn/morphe-patches/issues/1016)
* **TeraBox - GmsCore support:** sign in with MicroG-RE account ([fbd8fc4](https://github.com/hxreborn/morphe-patches/commit/fbd8fc4749ee8dbcd4b1ed75661f969107dccfa1)), closes [#993](https://github.com/hxreborn/morphe-patches/issues/993)
* update to Patcher 2.5.0 ([a781731](https://github.com/hxreborn/morphe-patches/commit/a781731aa0879139eb6b47e4bcf4cd51ee22cc9f))

### Updated App Support

* **Graph Messenger:** add support for `13.2.2.2` ([903d85c](https://github.com/hxreborn/morphe-patches/commit/903d85c61d0ba6c5a3d22a09e4d97463415ecc4f)), closes [#999](https://github.com/hxreborn/morphe-patches/issues/999)

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.3.0-all.jar    

Skipped:  
Gboard: jasonwu1994/Gboard-patches/patches-4.4.0.mpp
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

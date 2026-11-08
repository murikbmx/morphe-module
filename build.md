Gboard: 18.5.4.993608717-release-arm64-v8a  
GboardLite: 18.5.1.993608717-lite_beta-arm64-v8a  
GooglePhotos: 7.92.0.977185651  
ProtonVPN: 5.21.9.0  
YouTube: 21.30.216  
Default Morphe settings for YouTube:  
- morphe_video_quality_default_wifi = 1080
- morphe_shorts_quality_default_wifi = 1080
- morphe_hide_end_screen_cards = true
- morphe_hide_end_screen_suggested_video = true
- morphe_header_logo = PREMIUM
- morphe_shorts_autoplay = true  

Non-root APK requires [MicroG-RE 7.3.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.0)  
MicroG-RE for arm64-v8a: [microg-7.3.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.0/microg-7.3.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.74.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.74.0)

<details><summary>Patches release notes (v1.74.0)</summary>

## [1.74.0](https://github.com/hxreborn/morphe-patches/compare/v1.73.0...v1.74.0) (2026-11-08)

### Bug Fixes

* **Castle - Unlock premium:** play premium titles at 1080p ([705f700](https://github.com/hxreborn/morphe-patches/commit/705f70010c760ea08fe0776fe7690cf5c0860585))
* **Castle for TV - Unlock premium:** play titles at 1080p ([725842a](https://github.com/hxreborn/morphe-patches/commit/725842aa72fcba88f73132354abf21a677985f3c)), closes [#664](https://github.com/hxreborn/morphe-patches/issues/664)
* **MovieBoxTV - All-In-One:** fix quality selection ([3e6de74](https://github.com/hxreborn/morphe-patches/commit/3e6de7418106ffff291c748aabb598693e573613)), closes [#648](https://github.com/hxreborn/morphe-patches/issues/648)

### New Features

* **MARKS - Fix edge-to-edge:** keep controls clear of system bars ([ded85bc](https://github.com/hxreborn/morphe-patches/commit/ded85bca3629214014d6cc18202bdbd425c3d0c9))
* **MARKS - GmsCore support:** sign in with Google ([0b4b528](https://github.com/hxreborn/morphe-patches/commit/0b4b5289cf98ac4a92830d5c22374b0a1d7258de))
* **MARKS - Remove ads:** remove promotional messages ([122b7cc](https://github.com/hxreborn/morphe-patches/commit/122b7cc4e5afec7f1d93d3109a707ab860db0142))
* **MARKS - Unlock premium:** unlock premium practice features ([db17c67](https://github.com/hxreborn/morphe-patches/commit/db17c6796d84fdc3772fb92f26fb4329ad93c376))
* **TeraBox - Show backup count:** include paused and waiting files ([8e08749](https://github.com/hxreborn/morphe-patches/commit/8e087499894d9f3415404c000f3cf4d4a953fef0)), closes [#606](https://github.com/hxreborn/morphe-patches/issues/606)
* **Viber - Disable AI features:** remove ChatGPT entry points ([cf1cf4a](https://github.com/hxreborn/morphe-patches/commit/cf1cf4af1f7c97367587c862acfa622b5c8cc7d4)), closes [#667](https://github.com/hxreborn/morphe-patches/issues/667)
* **Viber - Disable AI features:** remove inline Translate buttons ([af4644b](https://github.com/hxreborn/morphe-patches/commit/af4644b4f2c256990b69883df4d86aa14440654c)), closes [#666](https://github.com/hxreborn/morphe-patches/issues/666)

### Updated App Support

* **Audible:** add support for `26.43.17` ([1a029e1](https://github.com/hxreborn/morphe-patches/commit/1a029e16bb72b5a2277192e86ce3dbd7d3d989a0)), closes [#547](https://github.com/hxreborn/morphe-patches/issues/547)
* **botim:** add support for `4.21.0` ([e34cc80](https://github.com/hxreborn/morphe-patches/commit/e34cc80eee2c30f6323d83ff5a813fa1aa23d08e)), closes [#550](https://github.com/hxreborn/morphe-patches/issues/550)

</details>

Patches: jasonwu1994/Gboard-patches/patches-4.2.0.mpp  
[Changelog](https://github.com/jasonwu1994/Gboard-patches/releases/tag/v4.2.0)

<details><summary>Patches release notes (v4.2.0)</summary>

### ✨ New Features

* **Gboard:** add an option to automatically select all text before copying or cutting when nothing is selected, available through the toolbar, long-press shortcuts, and globe-key drag gestures.
* **Gboard:** update morphe-patcher to **v2.1.0**.
* **Gboard:** add a search button to the Patches settings page to quickly find settings.
* **Gboard:** extend the G Logo on Spacebar patch with custom image support, a full-color Google G icon, and adjustable icon sizes.

### 🐛 Bug Fixes

* **Gboard:** fix paste shortcuts from the toolbar, long-press actions, and globe-key drag gestures in terminal input fields such as Termux.

### ✨ 新功能

* **Gboard:** 新增「未選取文字時自動全選」選項，支援透過工具列、長按及地球鍵拖曳快捷操作，全選並複製或剪下文字。
* **Gboard:** 將 morphe-patcher 更新至 **v2.1.0**。
* **Gboard:** 在 Patches 設定頁面新增搜尋按鈕，方便快速尋找設定項目。
* **Gboard:** 「G Logo on Spacebar」Patch 新增自訂圖片與「Google G（全彩）」圖示，並支援自訂圖示大小。

### 🐛 修復

* **Gboard:** 修復工具列、長按及地球鍵拖曳快捷貼上在 Termux 等終端機輸入介面中無法正常運作的問題。

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.1.1-all.jar  
Patches: kveld9/kveld-morphe-patches/patches-2.10.1.mpp  
[Changelog](https://github.com/kveld9/kveld-morphe-patches/releases/tag/v2.10.1)

<details><summary>Patches release notes (v2.10.1)</summary>

## [2.10.1](https://github.com/kveld9/kveld-morphe-patches/compare/v2.10.0...v2.10.1) (2026-11-02)

### Bug Fixes

* **brave:** restore Brave Origin patch name in catalog ([4f323af](https://github.com/kveld9/kveld-morphe-patches/commit/4f323af8fe7ac030c052ba6f7d6340a5a0c49dac)), closes [#209](https://github.com/kveld9/kveld-morphe-patches/issues/209)

</details>

Patches: RookieEnough/De-Vanced/patches-1.6.4.mpp  
[Changelog](https://github.com/RookieEnough/De-Vanced/releases/tag/v1.6.4)

<details><summary>Patches release notes (v1.6.4)</summary>

## [1.6.4](https://github.com/RookieEnough/De-Vanced/compare/v1.6.3...v1.6.4) (2026-11-04)

### 🐛 Bug Fixes

* **Messenger:** Add support for `586.0.0.55.92` ([#177](https://github.com/RookieEnough/De-Vanced/issues/177)) ([17584e2](https://github.com/RookieEnough/De-Vanced/commit/17584e2903e907c1d63b408cbf4201fc7b76a8e0))
* **Strava:** Fix `Overwrite media upload parameters` patch ([7c7a9af](https://github.com/RookieEnough/De-Vanced/commit/7c7a9af6e39c6ea892d4883151e2ddefe52376cc))

</details>

Patches: sashade8-ship-it/dual-vot-patches/patches-2.1.0-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.1.0-dualvot.8.5.4)

<details><summary>Patches release notes (v2.1.0-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.1.0-dualvot.8.5.4

Stable automated update based on Morphe Patches 2.1.0.

### Included

- Google/other and Yandex voice-over translation in one patch bundle.
- Separate player controls with mutual exclusion.
- Dual VoT volume controls and automatic reset when the video changes.
- Requests for previously untranslated Yandex videos.

### Validation

- Android patch bundle compiled successfully.
- Both translation patches are present in generated metadata.
- Required Dual VoT integration sources and bundle manifest were verified.

This release was produced automatically. Runtime regressions that cannot be
detected by compilation should be reported in this repository.

</details>  

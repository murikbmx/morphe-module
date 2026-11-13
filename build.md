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
  
Patches: hxreborn/morphe-patches/patches-1.77.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.77.0)

<details><summary>Patches release notes (v1.77.0)</summary>

## [1.77.0](https://github.com/hxreborn/morphe-patches/compare/v1.76.0...v1.77.0) (2026-11-12)

### Bug Fixes

* **Clip Studio Paint:** explain patch failure on APKs without libraries ([578e735](https://github.com/hxreborn/morphe-patches/commit/578e7352f2443722b90eae18fb4b597ab719c825))
* **DepthPix:** load wallpapers and collections again ([a7f00da](https://github.com/hxreborn/morphe-patches/commit/a7f00daeafd911fc380726c26f1adae5b1f268c1)), closes [#729](https://github.com/hxreborn/morphe-patches/issues/729)
* **MovieBox - All-In-One:** stop downloads saving upgrade notice clip ([1d16f56](https://github.com/hxreborn/morphe-patches/commit/1d16f567f6818b895a100044bf59022378cee1c0)), closes [#728](https://github.com/hxreborn/morphe-patches/issues/728)
* **Realme Link - AMOLED dark theme:** stop APKMirror patch error ([e6b97de](https://github.com/hxreborn/morphe-patches/commit/e6b97dec619ab051e4bc1baf496488750515ce5f)), closes [#739](https://github.com/hxreborn/morphe-patches/issues/739)
* restore v1.77.0-dev.1 changes except Proton VPN Frosted glass ([789d0a3](https://github.com/hxreborn/morphe-patches/commit/789d0a3a73f1d97ee96f1bab9d8efe6b6a2a3518))
* undo v1.77.0-dev.1 changes ([9ece60f](https://github.com/hxreborn/morphe-patches/commit/9ece60fb2374347ea37a5e23bbbaf5bfb788a356))
* **Viber - Hide Viber Out and channel promotions:** remove Contacts card ([57efac9](https://github.com/hxreborn/morphe-patches/commit/57efac90f2dcc01096c1c991afc8024ac9d2bedd)), closes [#704](https://github.com/hxreborn/morphe-patches/issues/704)

### New Features

* **Clip Studio Paint - Open drawing on launch:** skip home screen ([8eef290](https://github.com/hxreborn/morphe-patches/commit/8eef2909b8c1e24706f20e8157801bdf9261927f))
* **LaunchBox - Unlock premium:** remove 100-game limit ([a173e5c](https://github.com/hxreborn/morphe-patches/commit/a173e5cc32aae1bfc29aa851d27b55070a737044))
* **OK - Remove ads:** cover feed, groups, videos and clips ([19a4700](https://github.com/hxreborn/morphe-patches/commit/19a470098193cee176e1a01c8ef278fc67a28f65))
* **Proton VPN - Frosted glass:** blur map behind home panels and sheets ([ec6ae34](https://github.com/hxreborn/morphe-patches/commit/ec6ae34b30af23cf44c02813e6f369c230455a4a)), closes [#713](https://github.com/hxreborn/morphe-patches/issues/713)
* **ReadEra - Accent color:** replace yellow with wallpaper color ([f956b01](https://github.com/hxreborn/morphe-patches/commit/f956b012d543461743755a987730a5f1af707ec8))
* **ReadEra - App theme:** add AMOLED option for library and menus ([46942c1](https://github.com/hxreborn/morphe-patches/commit/46942c1ac0fdd6115bf9a714df0d4c0867b29b38))
* **ReadEra - Copy with source:** add title and author to copied text ([755fa61](https://github.com/hxreborn/morphe-patches/commit/755fa61971f67502a1067eee63052da083d16d57))
* **ReadEra - Full book descriptions:** show short and long text in full ([a4993a4](https://github.com/hxreborn/morphe-patches/commit/a4993a41e26a497dfbf1b0c548081266af63956d))
* **ReadEra - Lock screen on Read chapter aloud:** keep chapter playing ([26b283f](https://github.com/hxreborn/morphe-patches/commit/26b283f768934a19093aad621ce1059a3091332a))
* **ReadEra - Material 3 controls:** restyle switches and checkboxes ([5f62a43](https://github.com/hxreborn/morphe-patches/commit/5f62a438a1bf10f3df552ca28559dabec4d70afd))
* **ReadEra - More sleep timer choices:** add 5 and 10 minutes ([cb2210e](https://github.com/hxreborn/morphe-patches/commit/cb2210e599d1fe722bc93b8ee531a456787ae4c0))
* **ReadEra - Page counter in long chapters:** show past 999 pages ([475e88d](https://github.com/hxreborn/morphe-patches/commit/475e88d9a5261a731ac8349f35080bb3975d21dd))
* **ReadEra - Quotes and notes section:** share quotes and reviews ([9c8731a](https://github.com/hxreborn/morphe-patches/commit/9c8731a1ece46102ac051af690f74ac65ecfbd31))
* **ReadEra - Read aloud from selection:** start at selected sentence ([1b33c81](https://github.com/hxreborn/morphe-patches/commit/1b33c8111ddb5be609efd9cf29a8d38718033921))
* **ReadEra - Read aloud notification controls:** add Stop and countdown ([ccf6fac](https://github.com/hxreborn/morphe-patches/commit/ccf6fac004ba2cd5ec711e5f6896c1ec04ef77a5))
* **ReadEra - Read chapter aloud:** stop speech at end of chosen chapter ([eec72bd](https://github.com/hxreborn/morphe-patches/commit/eec72bd4848a10fe97721a204fff9a9331d0e671))
* **ReadEra - Search selection in book:** list matches for selected text ([878f49a](https://github.com/hxreborn/morphe-patches/commit/878f49a431d41f8158e4c6f19956bdc74c4d0bdd))
* **ReadEra - Speech pitch slider:** set 0.5x to 2x for each voice ([fca8198](https://github.com/hxreborn/morphe-patches/commit/fca81981956c4f82229d0bbeb044b111c723634b))
* **ReadEra - Text-to-speech filter:** edit word list in patches menu ([1fcabba](https://github.com/hxreborn/morphe-patches/commit/1fcabbaf9bf96d9fb0b18800e6d961bc9b4ab46a))
* **Xianyu - Allow sharing without login:** send public listing links ([40f01c1](https://github.com/hxreborn/morphe-patches/commit/40f01c18ffd138f7969010afddb6ba461461da42))
* **Xianyu - Skip login prompts:** stop unprompted login screens ([b9fbe66](https://github.com/hxreborn/morphe-patches/commit/b9fbe66feb0a220accd2ddbf440aecc8e4e5630a))

### Updated App Support

* **DepthPix:** add support for `1.0.35` ([4b4ebe7](https://github.com/hxreborn/morphe-patches/commit/4b4ebe766912edae0bd0df737293b96246a497de))
* **MyScript Notes:** add support for `7.4.8` ([4631632](https://github.com/hxreborn/morphe-patches/commit/4631632e60c38b02f41d4666e61753e77c868974)), closes [#703](https://github.com/hxreborn/morphe-patches/issues/703)
* **Public:** add support for `3.4.0` ([7fa7838](https://github.com/hxreborn/morphe-patches/commit/7fa783886216dc276b225bf8d698b9cb78099fcf)), closes [#707](https://github.com/hxreborn/morphe-patches/issues/707)

</details>

Patches: jasonwu1994/Gboard-patches/patches-4.3.0.mpp  
[Changelog](https://github.com/jasonwu1994/Gboard-patches/releases/tag/v4.3.0)

<details><summary>Patches release notes (v4.3.0)</summary>

### ✨ New Features

* **Gboard:** add an FAQ section to the Frosted Glass page, with links for when the effect isn't working and for flickering on Pixel phones.
* **Gboard:** change the defaults of two settings: English Up-Flick Uppercase is now off and the Access Points menu style is now on. Settings you have already saved are kept.

### 🐛 Bug Fixes

* **Gboard:** fix the keyboard closing by itself with Frosted Glass enabled ("Software rendering doesn't support drawRenderNode"). If blur fails to draw, the keyboard now falls back to its theme.
* **Gboard:** make "Extend to navigation bar" work on Android 15 and below. The navigation bar follows the keyboard's transparency, without blur.
* **Gboard:** make "Extend to navigation bar" work with narrower docked keyboards, such as one-handed mode.

### ✨ 新功能

* **Gboard:** 在「磨砂玻璃」頁面新增 FAQ 區塊，提供「為什麼磨砂玻璃沒有效果？」和「為什麼 Pixel 手機輸入文字時會閃爍？」的說明連結。
* **Gboard:** 調整兩項設定的預設值：「英文鍵盤上滑大小寫」改為關閉，「Access Points 選單樣式」改為開啟。已儲存的設定不受影響。

### 🐛 修復

* **Gboard:** 修復啟用磨砂玻璃後鍵盤自行關閉的問題（`Software rendering doesn't support drawRenderNode`）。模糊效果繪製失敗時，鍵盤會改回使用主題背景。
* **Gboard:** 修復「延伸到導覽列」在 Android 15 以下沒有效果的問題。導覽列會跟隨鍵盤的透明度，但沒有模糊效果。
* **Gboard:** 修復「延伸到導覽列」在單手模式等較窄的固定式鍵盤上沒有效果的問題。

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

Patches: sashade8-ship-it/dual-vot-patches/patches-2.2.0-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.2.0-dualvot.8.5.4)

<details><summary>Patches release notes (v2.2.0-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.2.0-dualvot.8.5.4

Stable automated update based on Morphe Patches 2.2.0.

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

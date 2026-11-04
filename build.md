Gboard: 18.5.4.993608717-release-arm64-v8a  
GooglePhotos: 7.92.0.977185651  

Non-root APK requires [MicroG-RE 7.3.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.0)  
MicroG-RE for arm64-v8a: [microg-7.3.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.0/microg-7.3.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
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

CLI: MorpheApp/morphe-cli/morphe-desktop-2.0.0-all.jar  
Patches: RookieEnough/De-Vanced/patches-1.6.4.mpp  
[Changelog](https://github.com/RookieEnough/De-Vanced/releases/tag/v1.6.4)

<details><summary>Patches release notes (v1.6.4)</summary>

## [1.6.4](https://github.com/RookieEnough/De-Vanced/compare/v1.6.3...v1.6.4) (2026-11-04)

### 🐛 Bug Fixes

* **Messenger:** Add support for `586.0.0.55.92` ([#177](https://github.com/RookieEnough/De-Vanced/issues/177)) ([17584e2](https://github.com/RookieEnough/De-Vanced/commit/17584e2903e907c1d63b408cbf4201fc7b76a8e0))
* **Strava:** Fix `Overwrite media upload parameters` patch ([7c7a9af](https://github.com/RookieEnough/De-Vanced/commit/7c7a9af6e39c6ea892d4883151e2ddefe52376cc))

</details>  

Skipped:  
YouTube: sashade8-ship-it/dual-vot-patches/patches-2.0.0-dualvot.8.5.4.mpp  

Без изменений, перенесено из релиза 10:  
- youtube-dualvot-module-v21.30.216-arm64-v8a.zip  
- youtube-dualvot-v21.30.216-arm64-v8a.apk  

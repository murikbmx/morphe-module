Skipped Gboard: stock com.google.android.inputmethod.latin 18.5.4.993608717-release-arm64-v8a (arm64-v8a) was not found. Upload it to the 'stock-apks' release as 'com.google.android.inputmethod.latin-18.5.4.993608717-release-arm64-v8a-arm64-v8a.apk' (or '.apkm')  
GooglePhotos: 7.92.0.977185651  
YouTube: 21.30.216  
Default Morphe settings for YouTube:  
- morphe_video_quality_default_wifi = 1080
- morphe_shorts_quality_default_wifi = 1080
- morphe_header_logo = PREMIUM
- morphe_shorts_autoplay = true  

Non-root APK requires [MicroG-RE 7.3.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.0)  
MicroG-RE for arm64-v8a: [microg-7.3.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.0/microg-7.3.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: jasonwu1994/Gboard-patches/patches-4.1.1.mpp  
[Changelog](https://github.com/jasonwu1994/Gboard-patches/releases/tag/v4.1.1)

<details><summary>Patches release notes (v4.1.1)</summary>

### 🐛 Bug Fixes

* **Gboard:** fix a crash when opening the keyboard on Android 13 and earlier.
* **Gboard:** fix Android stopping Web Clipboard after 6 hours and a crash when restarting the service.

### 🐛 修復

* **Gboard:** 修復在 Android 13 及更早版本上開啟鍵盤時閃退的問題。
* **Gboard:** 修復 Web Clipboard 執行 6 小時後被 Android 停止，以及重新啟動服務時閃退的問題。

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-1.20.0-all.jar  
Patches: RookieEnough/De-Vanced/patches-1.6.2.mpp  
[Changelog](https://github.com/RookieEnough/De-Vanced/releases/tag/v1.6.2)

<details><summary>Patches release notes (v1.6.2)</summary>

## [1.6.2](https://github.com/RookieEnough/De-Vanced/compare/v1.6.1...v1.6.2) (2026-10-29)

### 🐛 Bug Fixes

* **Amazon Music:** Use correct version constrain ([3bb19eb](https://github.com/RookieEnough/De-Vanced/commit/3bb19eb04645d315d8e5df7f2eb0d4194d2810eb))

</details>

Patches: sashade8-ship-it/dual-vot-patches/patches-2.0.0-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.0.0-dualvot.8.5.4)

<details><summary>Patches release notes (v2.0.0-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.0.0-dualvot.8.5.4

Stable automated update based on Morphe Patches 2.0.0.

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

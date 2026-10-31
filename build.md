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
  
Patches: sashade8-ship-it/dual-vot-patches/patches-2.1.0-dev.4-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.1.0-dev.4-dualvot.8.5.4)

<details><summary>Patches release notes (v2.1.0-dev.4-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.1.0-dev.4-dualvot.8.5.4

Pre-release automated update based on Morphe Patches 2.1.0-dev.4.

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

CLI: MorpheApp/morphe-cli/morphe-desktop-1.20.0-all.jar    

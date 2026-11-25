ProtonVPN: 5.21.57.0  

Non-root APK requires [MicroG-RE 7.3.3](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.3.3)  
MicroG-RE for arm64-v8a: [microg-7.3.3-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.3.3/microg-7.3.3-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: hxreborn/morphe-patches/patches-1.87.0.mpp  
[Changelog](https://github.com/hxreborn/morphe-patches/releases/tag/v1.87.0)

<details><summary>Patches release notes (v1.87.0)</summary>

## [1.87.0](https://github.com/hxreborn/morphe-patches/compare/v1.86.0...v1.87.0) (2026-11-24)

### Bug Fixes

* **Athan - Save images to gallery:** save images on mount installs ([2967fa7](https://github.com/hxreborn/morphe-patches/commit/2967fa73258405ea0bcf98eec44527891dee0c7a))
* **BeReal - Back up memories:** run in app on mount installs ([faedaa1](https://github.com/hxreborn/morphe-patches/commit/faedaa1a49d0bd3a06fef826063b4dedd82834b9))
* **BeReal - Disable data collection:** stop crash reports on mount ([df9df6b](https://github.com/hxreborn/morphe-patches/commit/df9df6b6182337f155914f98777c903c576c4857))
* **BeReal - Post from gallery:** skip photo prompt on mount installs ([687729b](https://github.com/hxreborn/morphe-patches/commit/687729b623a7290dcbd4c72a1704873c4be08636))
* **BeReal - Remove ads:** stop ad network startup on mount installs ([ce47be1](https://github.com/hxreborn/morphe-patches/commit/ce47be15ee25666241e4234cc3c885d52109ba46))
* **BeReal - Remove contacts permission:** skip mount installs ([ad5e512](https://github.com/hxreborn/morphe-patches/commit/ad5e512672b2cc30d3f4f750d2ec1a5cb9c78852))
* **BitTorrent - AMOLED dark theme:** open patches menu on mount installs ([32c5029](https://github.com/hxreborn/morphe-patches/commit/32c50293fc23729a350ae2b3aed24cd2090699fe))
* **Clip Studio Paint - Skip plan selection:** work when signed in ([cfea61c](https://github.com/hxreborn/morphe-patches/commit/cfea61c33785546cfe2affc26f2f396525730909)), closes [#774](https://github.com/hxreborn/morphe-patches/issues/774)
* **Internet Speed Meter Lite - Unlock premium:** open overview on mount ([76b2e01](https://github.com/hxreborn/morphe-patches/commit/76b2e01497ffe821df562b6e5309a0f2d451a30d))
* **Keepa - Multiple accounts:** open accounts screen on mount installs ([0230364](https://github.com/hxreborn/morphe-patches/commit/02303648d61180ff83be01ce1bf2b4c29cedf686))
* **Moon+ Reader - Unlock pro:** mention missing widget on mount installs ([40aaf5f](https://github.com/hxreborn/morphe-patches/commit/40aaf5f1fd39e8d5dffb71e0c403a96fccfdb3e9))
* **Network Analyzer - Export results:** share CSV as text on mount ([d21c95c](https://github.com/hxreborn/morphe-patches/commit/d21c95c13949f2951fc61c62da278508103a60e2))
* **Network Analyzer:** open added tools on mount installs ([8cd8647](https://github.com/hxreborn/morphe-patches/commit/8cd8647dbe0136ac8ccc10ca941a62514aa34ac2))
* **Outlook - Add unread shortcut:** open unread mail on every tap ([1d27ef2](https://github.com/hxreborn/morphe-patches/commit/1d27ef2dfa559c337338abe04c9cb9c53344258c))
* **ReadEra - Lock screen on Read chapter aloud:** skip mount installs ([ea67691](https://github.com/hxreborn/morphe-patches/commit/ea6769134be8c30d846d9cac27d2ab69c6819713))
* **ReadEra - Quotes and notes section:** open notes on mount installs ([543724b](https://github.com/hxreborn/morphe-patches/commit/543724b44d83213c474c17425ef3cea591562d3f))
* **ReadEra:** open patches menu on mount installs ([4d1b27d](https://github.com/hxreborn/morphe-patches/commit/4d1b27d0bc9316e4cefdda9c5103ffe7cdf7d4dd))
* **RedReader - Filter posts:** open filter settings on mount installs ([d214a12](https://github.com/hxreborn/morphe-patches/commit/d214a1280532416cfcb7c9e2bc0d2ebbb10682ce))
* **TeraBox - Clone app:** skip mount installs ([7ef4734](https://github.com/hxreborn/morphe-patches/commit/7ef4734fda7d5a66c78ff48b849c14d4a0391d88))
* **ULTIMEA - Fine equalizer:** share presets as text on mount installs ([f06c7b6](https://github.com/hxreborn/morphe-patches/commit/f06c7b60e348b16ad2a15d7f9b1cc27e3dfc7a3c))
* **ULTIMEA:** open patches menu on mount installs ([6351805](https://github.com/hxreborn/morphe-patches/commit/63518050fb96052bcd653a67df2ab81d3a2f14c4))
* **Viber:** open patches menu on mount installs ([2939c30](https://github.com/hxreborn/morphe-patches/commit/2939c30575cc0052edb534ca81671248f9ac6ba3))
* **VPN Super - Disconnect from notification:** disconnect on mount ([5e26b63](https://github.com/hxreborn/morphe-patches/commit/5e26b630a55d9510dec6e6a8a739faf8109edec7))
* **Xtream Player - Full Android Auto screen:** skip mount installs ([853f9fb](https://github.com/hxreborn/morphe-patches/commit/853f9fb7fdbb44b87c910e57bc2d80fd0087d488))
* **µTorrent - AMOLED dark theme:** open patches menu on mount installs ([8f0f522](https://github.com/hxreborn/morphe-patches/commit/8f0f522fd583d0d6b138c671e50a5616ce78d1cd))

### New Features

* **Chess Scanner - Unlock premium:** unlock unlimited scans and exports ([13e31f0](https://github.com/hxreborn/morphe-patches/commit/13e31f0073b97222bf7308d343b914b4f091c8b4))
* **FV File Explorer - Remove banner ads:** clear home and archive ads ([8e09cd0](https://github.com/hxreborn/morphe-patches/commit/8e09cd07cbfac234381137e807a95d33cd47c382))
* **MovieBox - Disable update prompts:** stop update dialogs ([c5aa431](https://github.com/hxreborn/morphe-patches/commit/c5aa431d37a2f55d1c293bd8057e5577da6c4ef8))
* **MovieBox - Remove ads:** remove video and banner ads ([d02acf8](https://github.com/hxreborn/morphe-patches/commit/d02acf8a7ef438f8a9285f9381934d798c7b4f7e))
* **MovieBox - Unlock premium:** unlock downloads and Laboratory menu ([bde09de](https://github.com/hxreborn/morphe-patches/commit/bde09de7293bd084ae5119d4222ae875af0bcf4a))
* **Outlook - Add unread shortcut:** open unread mail from app icon ([e12f830](https://github.com/hxreborn/morphe-patches/commit/e12f8304f7d0813adb04883a09c8eb2fb84ef09e))
* **Outlook - Fix sign-in:** sign in to Microsoft accounts ([2f8618c](https://github.com/hxreborn/morphe-patches/commit/2f8618c3595737f6f08aefb57d0db3c78360f614))
* **Outlook - GmsCore support:** add Google accounts through GmsCore ([af10c40](https://github.com/hxreborn/morphe-patches/commit/af10c4011d7da882ce2a86bbbbf070e0b6b99c9d))
* **Outlook - Hide Copilot:** remove chat, summaries and writing help ([4935f8f](https://github.com/hxreborn/morphe-patches/commit/4935f8f49783b26b281d71ec458b901472b95484))
* **Outlook - Keep messages unread:** leave opened mail unread ([2c20892](https://github.com/hxreborn/morphe-patches/commit/2c208928d675270c867e136f466cc7fbdf6e95cc))
* **Outlook - Open email templates:** open .oft files as new drafts ([32699fe](https://github.com/hxreborn/morphe-patches/commit/32699fe78e997313c04d3557f9d654013219cc6a))
* **Outlook - Remove inbox ads:** hide sponsored rows in inbox ([b66c5fc](https://github.com/hxreborn/morphe-patches/commit/b66c5fcaaba765cd717a8c998c53b15f4ea90952))
* **Outlook - Select multiple search results:** act on results in bulk ([1b6feed](https://github.com/hxreborn/morphe-patches/commit/1b6feed28e73c608302051e6b8505ae1e3a15270))
* **Podcast Republic:** remove ads ([492c2e6](https://github.com/hxreborn/morphe-patches/commit/492c2e62d3450fa749031711634bb76bd626ed81))
* **Poweramp Equalizer - Unlock premium:** remove time-limited trial ([5d71a41](https://github.com/hxreborn/morphe-patches/commit/5d71a41961f75c368fc37727b4e3508b8fcff4d6))
* **Proton VPN, Proton Pass:** add support for F-Droid builds ([98dd895](https://github.com/hxreborn/morphe-patches/commit/98dd895883971ba25307c217fa9e410bb8c38948)), closes [#1029](https://github.com/hxreborn/morphe-patches/issues/1029)

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

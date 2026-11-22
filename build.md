Gboard: 18.5.4.993608717-release-arm64-v8a  
GboardLite: 18.6.3.1002251336-lite_release-arm64-v8a  
GooglePhotos: 7.92.0.977185651  
ProtonVPN: 5.21.57.0  
YouTube: 21.30.216  
Default Morphe settings for YouTube:  
- morphe_shorts_quality_default_wifi = 1080
- morphe_hide_end_screen_cards = true
- morphe_hide_end_screen_suggested_video = true
- morphe_header_logo = PREMIUM
- morphe_shorts_autoplay = true
- morphe_video_quality_default_wifi = 1080  

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

Patches: jasonwu1994/Gboard-patches/patches-4.4.0.mpp  
[Changelog](https://github.com/jasonwu1994/Gboard-patches/releases/tag/v4.4.0)

<details><summary>Patches release notes (v4.4.0)</summary>

### ✨ New Features

* **Gboard:** switch icon sizing in the G logo patch from dp to percentages. Your icons can now get biiiiiig!
* **Gboard:** add support for custom package names in Package Rename.
* **Gboard:** add the Shift + Backspace Forward Delete patch. Hold Shift and press Backspace to delete the character after the cursor, like the Delete key on a computer keyboard.
* **Gboard:** add a **Rambler Auto Stop** option (Off, 3 seconds, 5 seconds, or custom 1–59 seconds) to **Advanced Voice Typing** to automatically stop Rambler voice typing and keep the text after the chosen period of silence.
* **Gboard:** add a **Shortcut position** option (**First** or **Last**) to **Long-Press Editing Shortcuts** to choose where the editing shortcut appears in a key's long-press popup.

### 🐛 Bug Fixes

* **Gboard:** fix **Key transparency** in **Frosted Glass** not applying to the circular background behind the microphone or other shortcut in the top-right toolbar slot, while keeping the icon clear and preserving transparent idle states.
* **Gboard:** keep standard voice typing in Traditional Chinese (zh-TW) on Gboard's built-in S3 recognizer with **Advanced Voice Typing**, and allow S3 voice typing in airplane mode when a usable network (such as Wi-Fi) is connected.

### ✨ 新功能

* **Gboard:** G logo patch：圖示大小從 dp 改為百分比調整，現在你的圖示可以變得超級大！
* **Gboard:** Package Rename 新增自訂套件名稱功能。
* **Gboard:** 新增「Shift + Backspace Forward Delete」Patch。按住 Shift 再按退格鍵，就能刪除游標右邊的字，就像電腦鍵盤上的 Delete 鍵。
* **Gboard:** 在「進階語音輸入」新增「Rambler 自動停止」選項（關閉、3 秒、5 秒或自訂 1–59 秒），停止說話達設定時間後自動結束 Rambler 語音輸入並保留文字。
* **Gboard:** 在「長按編輯快捷鍵」新增「快捷鍵位置」選項（第一個／最後一個），可自訂快捷鍵在長按選單中的位置。

### 🐛 修復

* **Gboard:** 修復「磨砂玻璃」的「按鍵透明度」未套用到工具列最右側麥克風或其他快捷按鈕圓底的問題，同時保持前景圖示清晰並保留自訂主題的待機透明狀態。
* **Gboard:** 搭配「進階語音輸入」時，讓繁體中文（zh-TW）標準語音輸入維持使用 Gboard 內建 S3 辨識器，並修復飛航模式下已連上可用網路（如 Wi-Fi）時 S3 語音輸入被拒絕的問題。

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.3.0-all.jar  
Patches: kveld9/kveld-morphe-patches/patches-2.11.0.mpp  
[Changelog](https://github.com/kveld9/kveld-morphe-patches/releases/tag/v2.11.0)

<details><summary>Patches release notes (v2.11.0)</summary>

## [2.11.0](https://github.com/kveld9/kveld-morphe-patches/compare/v2.10.1...v2.11.0) (2026-11-16)

### Bug Fixes

* **brave:** bump target version to 1.99.55 ([4f80a76](https://github.com/kveld9/kveld-morphe-patches/commit/4f80a76e2882ff8986e444a6ca0bc79a07c9a3ec))
* **brave:** cache negative wallpaper resource lookup ([e502bbd](https://github.com/kveld9/kveld-morphe-patches/commit/e502bbd976ad8d5d2812d1538236d27b08e4c813))
* **brave:** cache reflective ad error constructor ([0e4f644](https://github.com/kveld9/kveld-morphe-patches/commit/0e4f644978a5eeec3097b672010af8a552482d99))
* **brave:** cache reflective method lookups during tab group close ([37ef233](https://github.com/kveld9/kveld-morphe-patches/commit/37ef233a4e83272f58c2b1bdc8c22f4931ed1d81))
* **brave:** cache SHA-256 certificate digests during signature check ([dae411b](https://github.com/kveld9/kveld-morphe-patches/commit/dae411b752800c32dd9301adef6bd79b6afd4d17))
* **brave:** keep ad signup promo suppression working across updates ([47ea8de](https://github.com/kveld9/kveld-morphe-patches/commit/47ea8de4d1aa5ecd11f1306bc66678b198562599))
* **brave:** keep clean new tab page working across browser updates ([e82daa0](https://github.com/kveld9/kveld-morphe-patches/commit/e82daa0fe612d9fc19bd0bbbc9cb108bc87ff9f2))
* **brave:** update libchrome tracking server offsets for 1.99.57 ([c62b8de](https://github.com/kveld9/kveld-morphe-patches/commit/c62b8decb5960e6dd12a7818ad77b2de1bfdb68b))
* **brave:** update native telemetry redirection offsets for 1.99.55 ([cb66f5f](https://github.com/kveld9/kveld-morphe-patches/commit/cb66f5f8303923c62bbfe750ec05d9fe448cfee2))
* **brave:** update obfuscated origin preferences hooks for 1.99.55 ([2c2c8f8](https://github.com/kveld9/kveld-morphe-patches/commit/2c2c8f8c5537ed464e938948f091c66795f89a09))
* **brave:** update supported version to 1.99.56 ([a8fdfd4](https://github.com/kveld9/kveld-morphe-patches/commit/a8fdfd48396c50b6051ef219f4109493e803f265))
* **brave:** update supported version to 1.99.57 ([cb7a675](https://github.com/kveld9/kveld-morphe-patches/commit/cb7a67575caa263f5e90a1c677cf3c3b631d419e))
* **gboard:** AMOLED theme hook for Gboard 18.6.3 ([214a9b8](https://github.com/kveld9/kveld-morphe-patches/commit/214a9b8706c4795236d6165ce97be45b05366df0))
* **gboard:** Block Trackers hooks for Gboard 18.6.3 ([83be87a](https://github.com/kveld9/kveld-morphe-patches/commit/83be87aa1ca6e3d949e29026e7824237b40581c5))
* **gboard:** bypass signature validation in SignatureUtils instead of aborting dispatcher ([250d738](https://github.com/kveld9/kveld-morphe-patches/commit/250d738a7a5d7ad5be78a18b0f912e34a7b766f0))
* **gboard:** Force Incognito hooks for Gboard 18.6.3 ([ef11ccf](https://github.com/kveld9/kveld-morphe-patches/commit/ef11ccf92de8579e0e8fc0cbbfdc054b830b7c4b))
* **gboard:** keep the raised unpinned clips limit after pinning ([cfe2c53](https://github.com/kveld9/kveld-morphe-patches/commit/cfe2c536ebe293b0abcdea923abe5b6c028ec792)), closes [#205](https://github.com/kveld9/kveld-morphe-patches/issues/205)
* **gboard:** Keyboard Settings hook for Gboard 18.6.3 ([3072c72](https://github.com/kveld9/kveld-morphe-patches/commit/3072c72cb4f719bb08ea7184a18e611aadd7506a))
* **gboard:** Offline Only hooks for Gboard 18.6.3 ([380d540](https://github.com/kveld9/kveld-morphe-patches/commit/380d54006f14fec832610c67f84f6acc0c03c56e))
* **gboard:** prevent frame drops in navigation bar pre-draw listener ([07ddc54](https://github.com/kveld9/kveld-morphe-patches/commit/07ddc544768747c1d650d90e6b0db5d7cda237bc))
* **gboard:** prune obsolete 5-item array limit replacement in clipboard loader ([3952931](https://github.com/kveld9/kveld-morphe-patches/commit/395293111aa6551f903f8ceea98d4679d436028d))
* **gboard:** prune obsolete emoji scale experiment flag for 18.6.3 ([228037c](https://github.com/kveld9/kveld-morphe-patches/commit/228037c9ff54866104d513629eeacc8c91c70591))
* **gboard:** remove residual 100 cap for end-to-end 200 support ([939ec45](https://github.com/kveld9/kveld-morphe-patches/commit/939ec4539f2e273ddc2922ad35838396786b272c)), closes [#205](https://github.com/kveld9/kveld-morphe-patches/issues/205)
* **gboard:** schedule process restart using exact alarms with fallbacks ([65f4102](https://github.com/kveld9/kveld-morphe-patches/commit/65f41028c6dbbfd07ceda1f56d6ec848b23c93cc))
* **gboard:** Stop Background Sync hooks for Gboard 18.6.3 ([59b5640](https://github.com/kveld9/kveld-morphe-patches/commit/59b56408c6d696421494f996e14f97e2e41790c7))
* **gboard:** Stop Remote Updates hooks for Gboard 18.6.3 ([1747a9c](https://github.com/kveld9/kveld-morphe-patches/commit/1747a9cb6504bb5356ac91801eafb67e34a294cc))
* **gboard:** support Gboard 18.6.3 ([497c0aa](https://github.com/kveld9/kveld-morphe-patches/commit/497c0aaf0b5c5e6ca1504212698868c3fdb916b2))
* **gboard:** Top Toolbar Item Count hook for Gboard 18.6.3 ([744ff50](https://github.com/kveld9/kveld-morphe-patches/commit/744ff50c0a993ebe6211a99aa60f0fef88d27c6f))
* **gboard:** Translate character limit hook for Gboard 18.6.3 ([113036d](https://github.com/kveld9/kveld-morphe-patches/commit/113036dfb0e6579ddcbe7ed6c6b528bf8039ed8a))
* **gboard:** Voice Typing in Incognito hook for Gboard 18.6.3 ([17f331e](https://github.com/kveld9/kveld-morphe-patches/commit/17f331ec884f52ae404d20af9a400ffb97f707c2))
* **tiktok:** add close button and clear session cookies in Spotify auth dialog ([155d9f8](https://github.com/kveld9/kveld-morphe-patches/commit/155d9f8ec76329c8f7f351c4f584afcebf4eee27))
* **tiktok:** cache negative resource lookups in video description hider ([4d318be](https://github.com/kveld9/kveld-morphe-patches/commit/4d318be79f0d56189973d0d85c64b186d337da7c))
* **tiktok:** cache reflective members during video fit layout recalculation ([f033aac](https://github.com/kveld9/kveld-morphe-patches/commit/f033aacf1401d1023b15811cd07de3d588569084))
* **tiktok:** cache thread-local NumberFormat instances for exact count formatting ([9b5e5cb](https://github.com/kveld9/kveld-morphe-patches/commit/9b5e5cb50afc31cdd553248fb0a12446ce6b8a3b))
* **tiktok:** consolidate video quality tracking maps into bounded LRU caches ([470d056](https://github.com/kveld9/kveld-morphe-patches/commit/470d0566d27ad59d3434f49043ff5a1bc7763e52))
* **tiktok:** correct log prefix for author region hook ([0e94d22](https://github.com/kveld9/kveld-morphe-patches/commit/0e94d22901c2a6bb6d0d5796534de905ec909771))
* **tiktok:** correct log prefix for sensitive warnings hook ([e29932e](https://github.com/kveld9/kveld-morphe-patches/commit/e29932e57d13261ded4a4a3c3def84d71c06d097))
* **tiktok:** dynamically discover autoplay ability method in search experience customizer ([601ce30](https://github.com/kveld9/kveld-morphe-patches/commit/601ce30b06cd5823038374b91058aaaa9e1d22e5))
* **tiktok:** filter AI content and paid partnership posts in feed ([2f1965c](https://github.com/kveld9/kveld-morphe-patches/commit/2f1965c9dcf8b4e59754279d988211a876807435))
* **tiktok:** filter search suggestions using structural properties instead of localized strings ([a904a12](https://github.com/kveld9/kveld-morphe-patches/commit/a904a1277a55031933ccf81b14512168d237cf36))
* **tiktok:** harden feed interface triggers and assem fingerprints ([07e530c](https://github.com/kveld9/kveld-morphe-patches/commit/07e530c4efa767b2b01cfedeac8bbc46a810c5c1))
* **tiktok:** harden feed navigation declutter tab manager and provider discovery ([5ae80d4](https://github.com/kveld9/kveld-morphe-patches/commit/5ae80d4ab003dc190161666090dcbbb3a5f82269))
* **tiktok:** harden typing recommendation panel assem hooks against obfuscation drift ([b831b77](https://github.com/kveld9/kveld-morphe-patches/commit/b831b772dac784286d3598197e382ad3bbabbf52))
* **tiktok:** hook the current favorite button handler ([e2ba081](https://github.com/kveld9/kveld-morphe-patches/commit/e2ba08118ff455b34b7f38b225ed3a89783f2a12))
* **tiktok:** hook the current story tray pod provider ([688eaf6](https://github.com/kveld9/kveld-morphe-patches/commit/688eaf60da12cf8aec409831ddd7f3b50c7dd1b2))
* **tiktok:** include the exact APK link in update issues ([070596c](https://github.com/kveld9/kveld-morphe-patches/commit/070596c1b6fd25458dc152ae955e4caa3b6bd0ff))
* **tiktok:** keep clear display persistence working across obfuscation updates ([19a3fcf](https://github.com/kveld9/kveld-morphe-patches/commit/19a3fcf527f3fbbfa19ba78688463c43bcde32ff))
* **tiktok:** keep Google sign-in working across app updates ([e0fdfe4](https://github.com/kveld9/kveld-morphe-patches/commit/e0fdfe4089abfb2f68043112ecd93e9ecf44690d))
* **tiktok:** keep login detection working across app updates ([2fa6c78](https://github.com/kveld9/kveld-morphe-patches/commit/2fa6c78927ba5f53dd94c1113e6977dfc449489f))
* **tiktok:** keep privacy guard hooks verifier-safe on all register layouts ([da5837b](https://github.com/kveld9/kveld-morphe-patches/commit/da5837b656f326a6bf1f99cad8502e97f33c24fa))
* **tiktok:** keep the profile banner container hidden when there is no banner ([5a5e803](https://github.com/kveld9/kveld-morphe-patches/commit/5a5e80350cf5914d748f299bf00de15d2f998827)), closes [#214](https://github.com/kveld9/kveld-morphe-patches/issues/214)
* **tiktoklite:** bypass geoblocking popup and traffic drops ([f8ee40d](https://github.com/kveld9/kveld-morphe-patches/commit/f8ee40d4978fd3394a1fb73a645165f426c67941))
* **tiktoklite:** filter ads and coin rewards on feed fragment ingestion ([7d04dda](https://github.com/kveld9/kveld-morphe-patches/commit/7d04dda9db08a7d4ebed76a835dd7d3600636bd3))
* **tiktoklite:** keep clear display active when switching videos ([f7ebcda](https://github.com/kveld9/kveld-morphe-patches/commit/f7ebcdaf6da0a473fb3b96ce7b6643c674ae082d))
* **tiktoklite:** preserve DataTransport runtime in Block Trackers Setup ([6cc59a2](https://github.com/kveld9/kveld-morphe-patches/commit/6cc59a2f35d70b8d780127b31d2efc6e045d09b7))
* **tiktoklite:** preserve native Google sign-in ([4996259](https://github.com/kveld9/kveld-morphe-patches/commit/499625956acb6d42bac45be236913d0d8df08f30))
* **tiktoklite:** preserve onboarding completion state in Block Popups ([42ebe1f](https://github.com/kveld9/kveld-morphe-patches/commit/42ebe1fae33acee0695a7f747fd8527b85e0180d))
* **tiktoklite:** remember clear display mode across feed videos ([5498037](https://github.com/kveld9/kveld-morphe-patches/commit/54980373352a334975f8b9662162b810b6262b4f))
* **tiktoklite:** resolve startup crash when disabling push ([238191d](https://github.com/kveld9/kveld-morphe-patches/commit/238191d1d03c1089894db23b656eb131861f81ec))
* **tiktoklite:** restore device registration in Block Trackers ([04bb48f](https://github.com/kveld9/kveld-morphe-patches/commit/04bb48fe4e958810bb9cbed0d16495cabcc56420))
* **tiktoklite:** strip promotional share tail in Clean Share Links ([c4644be](https://github.com/kveld9/kveld-morphe-patches/commit/c4644be099aa1557e49b542ed6d534fb491e7b99))
* **tiktoklite:** update TikTok Lite target version to 47.7.51 ([b46b637](https://github.com/kveld9/kveld-morphe-patches/commit/b46b637ccd681f099bb08769ba629fbd394d93f2))
* **tiktok:** log font redirection at info level instead of error ([c881bb5](https://github.com/kveld9/kveld-morphe-patches/commit/c881bb5dd1bb07c81a0e934bd6ee6d98f7cbce87))
* **tiktok:** loosen voice comments fingerprint parameters on 47.7.2 ([4bba49b](https://github.com/kveld9/kveld-morphe-patches/commit/4bba49b904d5a748d700bf3a4396737afeba1664))
* **tiktok:** name the hooked method correctly in the direct message log ([afe10e7](https://github.com/kveld9/kveld-morphe-patches/commit/afe10e7772fb39302f48405813f78124afc8fc9d))
* **tiktok:** name the hooked method correctly in the video fit logs ([ae1b4a0](https://github.com/kveld9/kveld-morphe-patches/commit/ae1b4a07262592cb43a5e91f02c9c032148db825))
* **tiktok:** prevent delayed auto-pause callbacks from pausing subsequent videos ([9931392](https://github.com/kveld9/kveld-morphe-patches/commit/9931392ed9aec858f9eaffc8a639e8f81aa9e97b))
* **tiktok:** prevent memory growth in the comment action bar ([37ccef1](https://github.com/kveld9/kveld-morphe-patches/commit/37ccef1c31705a26240b67b1966615a560914051))
* **tiktok:** prevent privacy filter corruption from thread-local state ([17fa2c8](https://github.com/kveld9/kveld-morphe-patches/commit/17fa2c803132c6fe02e65a0e8dc0d82438ad9d39))
* **tiktok:** prune the dead GoogleOneTapAuth isAvailable hook ([9e3592a](https://github.com/kveld9/kveld-morphe-patches/commit/9e3592a990f2137f62771f3cdfba65a557e7d227))
* **tiktok:** remove ProfileComponentUIConfig override that broke profile loading ([bf8389b](https://github.com/kveld9/kveld-morphe-patches/commit/bf8389b1b4d310d43cc8dbfe453ac4ceef4baad5))
* **tiktok:** remove the ProfileBackgroundExp gate override that caused infinite profile loading loops ([7b5524e](https://github.com/kveld9/kveld-morphe-patches/commit/7b5524eace5223458a25e59a5d744bf5d38cc97d))
* **tiktok:** resolve video directly from gesture target and remove fake sound save ([ce2cd2a](https://github.com/kveld9/kveld-morphe-patches/commit/ce2cd2aa859e28bb17239cb5879dae73e8d8d23f))
* **tiktok:** restore auto-pause first video player controller on 47.7.2 ([2fd2d76](https://github.com/kveld9/kveld-morphe-patches/commit/2fd2d76e37a0ef751f147f64871fc36985c947c8))
* **tiktok:** restore auto-pause first video player controller on 47.7.3 ([c3e47e7](https://github.com/kveld9/kveld-morphe-patches/commit/c3e47e77a3487f7688da8f1679a3c8df8c27f719))
* **tiktok:** restore friends suggestions filter targets on 47.7.2 ([4e92aac](https://github.com/kveld9/kveld-morphe-patches/commit/4e92aac613d36378b7fce2dfab355df3e332102d))
* **tiktok:** restore friends suggestions filter targets on 47.7.3 ([04e11ca](https://github.com/kveld9/kveld-morphe-patches/commit/04e11caf64f3ef24450b43d6ff0db83086b33baa))
* **tiktok:** restore instant cold start hook on 47.7.2 ([d15e186](https://github.com/kveld9/kveld-morphe-patches/commit/d15e186bfde2fc49d20de7a467bdd71ae529c82e))
* **tiktok:** restore instant cold start hook on 47.7.3 ([9af2baf](https://github.com/kveld9/kveld-morphe-patches/commit/9af2baf784f35819c9e4c02f2e628ff58145651c))
* **tiktok:** restore system font patch on 47.7.2 ([6063eb7](https://github.com/kveld9/kveld-morphe-patches/commit/6063eb7b0dfcd47da22ae310500bfd08546c6bf9))
* **tiktok:** restore system font patch on 47.7.3 ([7a0bd49](https://github.com/kveld9/kveld-morphe-patches/commit/7a0bd4955bf974eb9db256fcb13b7e0e25abbeb6))
* **tiktok:** restore video fit mode on 47.7.2 ([3608892](https://github.com/kveld9/kveld-morphe-patches/commit/360889271b9c71e6c335e215f5c60a8377a3c667))
* **tiktok:** restore video fit mode on 47.7.3 ([8c6fec5](https://github.com/kveld9/kveld-morphe-patches/commit/8c6fec5b1a16dbaa64ba058ec2064ac502886060))
* **tiktok:** restrict content rules strictly to For You feed ([b422468](https://github.com/kveld9/kveld-morphe-patches/commit/b422468e39e4cb1233824e7daf5febfc4e615136))
* **tiktok:** stop hiding failures of the clean comment copying hook ([eaad72e](https://github.com/kveld9/kveld-morphe-patches/commit/eaad72e5b77236ff59e0f9359020598d767aab4d))
* **tiktok:** stop the black overlay on profiles without a banner ([3266744](https://github.com/kveld9/kveld-morphe-patches/commit/3266744ac6f5fe665ddac4082a5ec6f22a62b05f)), closes [#214](https://github.com/kveld9/kveld-morphe-patches/issues/214)
* **tiktok:** translate comments immediately when batch arrives ([b4f6af7](https://github.com/kveld9/kveld-morphe-patches/commit/b4f6af793e7af5bc96c33c655b9b2ec304553db5))
* **tiktok:** turn off the camera indicator when opening the camera fails ([a9706a3](https://github.com/kveld9/kveld-morphe-patches/commit/a9706a398b14a023de4fbe273a59c65e47e9e4b3))
* **tiktok:** update client ai governor targets on 47.7.2 ([6567cff](https://github.com/kveld9/kveld-morphe-patches/commit/6567cff1171661b9ee74cab5a20022f4288be310))
* **tiktok:** update client ai governor targets on 47.7.3 ([a144309](https://github.com/kveld9/kveld-morphe-patches/commit/a144309bd82cfd85e1f16f23f0a2514bf096398b))
* **tiktok:** update custom share sheet targets on 47.7.2 ([e714742](https://github.com/kveld9/kveld-morphe-patches/commit/e7147427407b3968fc9684f9c3698afc8aaf458c))
* **tiktok:** update custom share sheet targets on 47.7.3 ([76e16ea](https://github.com/kveld9/kveld-morphe-patches/commit/76e16ea9cb598c50fff22a692d300ba282a2b784))
* **tiktok:** update device privacy guard targets on 47.7.2 ([4873a12](https://github.com/kveld9/kveld-morphe-patches/commit/4873a121ba45cc9842ad1c3af9353477a2aef3a0))
* **tiktok:** update device privacy guard targets on 47.7.3 ([a6f162b](https://github.com/kveld9/kveld-morphe-patches/commit/a6f162bdcacc70f56415eb13020668f1d421dbb5))
* **tiktok:** update direct message declutter targets on 47.7.2 ([99b84ff](https://github.com/kveld9/kveld-morphe-patches/commit/99b84ffa0bb8b6cda65180c9057b7a09eb27b286))
* **tiktok:** update direct message declutter targets on 47.7.3 ([ae53374](https://github.com/kveld9/kveld-morphe-patches/commit/ae53374e54074696bfe275c5d58fbcdc7cff5bee))
* **tiktok:** update feed ads content filter targets on 47.7.2 ([63e7e69](https://github.com/kveld9/kveld-morphe-patches/commit/63e7e69907d1cbfabc8ef18837af7189addad3ab))
* **tiktok:** update feed ads content filter targets on 47.7.3 ([0bddeac](https://github.com/kveld9/kveld-morphe-patches/commit/0bddeac437e751c898e86ff772a69178e16ec4da))
* **tiktok:** update feed interface declutter assem and trigger targets on 47.7.2 ([cd5ae4b](https://github.com/kveld9/kveld-morphe-patches/commit/cd5ae4b577daae94f065f522294e784a3df53cb6))
* **tiktok:** update feed interface declutter assem and trigger targets on 47.7.3 ([701d30e](https://github.com/kveld9/kveld-morphe-patches/commit/701d30ed50efdf2512fe25ec30211dd95451860c))
* **tiktok:** update feed navigation declutter targets on 47.7.2 ([9f80c24](https://github.com/kveld9/kveld-morphe-patches/commit/9f80c24000242d794867877972ab727df7b1568e))
* **tiktok:** update feed navigation declutter targets on 47.7.3 ([e60d45c](https://github.com/kveld9/kveld-morphe-patches/commit/e60d45c0e1594d0d2e604b4dac882989fcfd68f2))
* **tiktok:** update force auto scroll bottom bar facade on 47.7.2 ([6724333](https://github.com/kveld9/kveld-morphe-patches/commit/672433349efc491b583a5a5ef97b42ab9c63402b))
* **tiktok:** update force auto scroll bottom bar facade on 47.7.3 ([4428289](https://github.com/kveld9/kveld-morphe-patches/commit/4428289e445a888f8070f7539081882ad022eda5))
* **tiktok:** update hide inbox promos and alerts targets on 47.7.2 ([8c2acc6](https://github.com/kveld9/kveld-morphe-patches/commit/8c2acc623d5f51e6df904c9f6512aadbf5f73ec7))
* **tiktok:** update hide inbox promos and alerts targets on 47.7.3 ([1e96c8e](https://github.com/kveld9/kveld-morphe-patches/commit/1e96c8ece774a28665f2acf6a56c5fec3ce5590d))
* **tiktok:** update history recording governor targets on 47.7.2 ([7204fc1](https://github.com/kveld9/kveld-morphe-patches/commit/7204fc13b678cb65ccc1e6c6624f49f50f444828))
* **tiktok:** update history recording governor targets on 47.7.3 ([4ee896e](https://github.com/kveld9/kveld-morphe-patches/commit/4ee896ed0c6ca6f4ceee58e824af8a9c2a5df3a1))
* **tiktok:** update popups and prompts suppressor targets on 47.7.2 ([dd59388](https://github.com/kveld9/kveld-morphe-patches/commit/dd593885ebe5b3d1ebeefe38a0ea42492e45f5fa))
* **tiktok:** update popups and prompts suppressor targets on 47.7.3 ([0e52980](https://github.com/kveld9/kveld-morphe-patches/commit/0e52980f27442da587add78ffc7c3a9b1d4b42d8))
* **tiktok:** update search experience customizer targets on 47.7.2 ([65f3708](https://github.com/kveld9/kveld-morphe-patches/commit/65f3708d6f7c6b20dd38e6d912f449d3cfaebadd))
* **tiktok:** update search experience customizer targets on 47.7.3 ([36aa2ba](https://github.com/kveld9/kveld-morphe-patches/commit/36aa2bad18fd532310b77d9b6bc57e2e18c68173))
* **tiktok:** update target version to 47.7.3 ([3d1f2cb](https://github.com/kveld9/kveld-morphe-patches/commit/3d1f2cbf88b2fc17e8adf88a09692358bc1ad837))
* **tiktok:** use the exact opcode when guarding the banner visibility call ([021621b](https://github.com/kveld9/kveld-morphe-patches/commit/021621bdd0bd255df7b740b86997fe2b2cbb88f9))
* **universal:** allocate sufficient registers for license verification bypass ([85d2aa3](https://github.com/kveld9/kveld-morphe-patches/commit/85d2aa30b69e6e929886fa095cfc5569a7f596fa))
* **universal:** guard Remove Debug Info against heap exhaustion ([24c924c](https://github.com/kveld9/kveld-morphe-patches/commit/24c924c7117a7902f5b15c422b23a7e3a56f9f14)), closes [MorpheApp/morphe-manager#1347](https://github.com/MorpheApp/morphe-manager/issues/1347)
* **universal:** isolate update patch state to prevent JVM cross-contamination ([ff48c79](https://github.com/kveld9/kveld-morphe-patches/commit/ff48c791e379487a90f2f38ff9ba0487a6dc45d0))
* **update-check:** clarify the update issue title ([e85e251](https://github.com/kveld9/kveld-morphe-patches/commit/e85e2517b51258b72e65b53faceae8054193d489))
* **update-check:** fetch only the latest Brave release to keep the check reliable ([d9c83ef](https://github.com/kveld9/kveld-morphe-patches/commit/d9c83efb608d54cf637b251694fefdfa5af0c37e))
* **update-check:** resume update notifications for Gboard Lite and TikTok ([de7f11a](https://github.com/kveld9/kveld-morphe-patches/commit/de7f11a94f006dfee42a97c069a731d5839d2689))
* **update-check:** use a user agent APKMirror accepts for app pages ([90c8a86](https://github.com/kveld9/kveld-morphe-patches/commit/90c8a86ca33c096cb1abbba02c456f3b1e85b4ac))

### New Features

* **brave:** link both release APKs in update issues ([74ebfa3](https://github.com/kveld9/kveld-morphe-patches/commit/74ebfa38e2a131b996bbffc45359eabed62cccec))
* **tiktok:** bump target version to 47.7.2 ([4952ef9](https://github.com/kveld9/kveld-morphe-patches/commit/4952ef988fba7a3d81ad972ad9e703fb8f753ae7))
* **tiktoklite:** adapt feed ad filter to minilite model for 47.7.51 ([8087ee4](https://github.com/kveld9/kveld-morphe-patches/commit/8087ee489b1d2f95f943ed8ce25f79bb3e2f1163))
* **tiktoklite:** adapt seekbar controller to minilite model for 47.7.51 ([81c52b3](https://github.com/kveld9/kveld-morphe-patches/commit/81c52b31d3f3371fdc9a3e737604b984e1d14c97))
* **tiktoklite:** bump target version to 47.6.51 and restore complete ui bundle ([e8c06b1](https://github.com/kveld9/kveld-morphe-patches/commit/e8c06b1f1bc502bf824de294f51d1dc00b4845b7))
* **tiktoklite:** bypass mandatory login wall ([e51cd88](https://github.com/kveld9/kveld-morphe-patches/commit/e51cd8837ec7fb09038bd7eeaa70b4da68f90850))
* **tiktoklite:** hook Aweme getShareUrl on minilite feed model for 47.7.51 ([a5bfa82](https://github.com/kveld9/kveld-morphe-patches/commit/a5bfa82fe764db71d258365fb8c8369fce6ae024))
* **tiktoklite:** implement persistent clear display mode across video scrolls ([740b28c](https://github.com/kveld9/kveld-morphe-patches/commit/740b28c15978dd8aeb4fa2dbbfbe4e7ce49d5dc4))
* **tiktoklite:** prune absent upload hook from QUIC suppression on 47.7.51 ([dec4b91](https://github.com/kveld9/kveld-morphe-patches/commit/dec4b918184f92892e0e5c0d5589948ee9cf2233))
* **tiktoklite:** prune non-applicable patches from TikTok Lite compatibility ([2a800b4](https://github.com/kveld9/kveld-morphe-patches/commit/2a800b4291f04f625df961a02f4aae07f8f76d61))
* **tiktoklite:** report TikTok Lite updates ([cca6ad4](https://github.com/kveld9/kveld-morphe-patches/commit/cca6ad4aa03691f5268e0229a1a49b24c87c8b88))
* **tiktoklite:** retarget playback display governor to minilite model for 47.7.51 ([3881125](https://github.com/kveld9/kveld-morphe-patches/commit/38811253a8aca5fe3866f7cf1bebc3b36d040988))
* **tiktoklite:** retarget playback speed to native simplify player for 47.7.51 ([d614c1d](https://github.com/kveld9/kveld-morphe-patches/commit/d614c1ddc6b3f03e87d82f7bcb402fc58a66d0d2))
* **tiktoklite:** retarget push service to minilite package for 47.7.51 ([a3cbc90](https://github.com/kveld9/kveld-morphe-patches/commit/a3cbc90aff1e48ca44720f596cc34bff77dcc041))
* **tiktoklite:** rotate push dialog check target for 47.7.51 ([3338ce8](https://github.com/kveld9/kveld-morphe-patches/commit/3338ce8f77f9f3615e5536efd72bc5c653927fa7))
* **tiktoklite:** silence modern Npth crash reporter overloads on 47.7.51 ([0a07139](https://github.com/kveld9/kveld-morphe-patches/commit/0a0713945b6b9695411ac8ed5e2dc715387e3c7b))
* **tiktok:** port hide seen videos feed filter to tiktok lite ([7d7cedc](https://github.com/kveld9/kveld-morphe-patches/commit/7d7cedcf9ba671ce759a82a934451de7737db63c))
* **universal:** add a battery-optimization toggle to the permission stripper ([2cf5c9c](https://github.com/kveld9/kveld-morphe-patches/commit/2cf5c9c30a7d789dc8dc0be1393dda84c10a24ef))
* **universal:** add a display-over-other-apps toggle to the permission stripper ([dc9eb7b](https://github.com/kveld9/kveld-morphe-patches/commit/dc9eb7bb2d1dfef5f9cd556ebca46a9ce0da3246))
* **universal:** add a financial-SMS toggle to the permission stripper ([35f130f](https://github.com/kveld9/kveld-morphe-patches/commit/35f130f0d23e7aa346088b0396f8507844dbe14c))
* **universal:** add a Phone permission toggle to the permission stripper ([34f9c79](https://github.com/kveld9/kveld-morphe-patches/commit/34f9c79b08cb7862e0a4bcde2c2ad1768fc3e393))
* **universal:** add a usage-access toggle to the permission stripper ([f783444](https://github.com/kveld9/kveld-morphe-patches/commit/f783444e1add436081f15cc06149a064b7575891))
* **universal:** add an exact-alarms toggle to the permission stripper ([7c36673](https://github.com/kveld9/kveld-morphe-patches/commit/7c366735da84e2c0c503d3b3de8028df1c6b201e))
* **universal:** add an install-apps toggle to the permission stripper ([0d631c9](https://github.com/kveld9/kveld-morphe-patches/commit/0d631c9ac10756c2e6cadf30e4f15dec9b89716c))
* **universal:** add an SMS permission toggle to the permission stripper ([607fc86](https://github.com/kveld9/kveld-morphe-patches/commit/607fc86ce3690317330324d3ca78cff4406fe099))

</details>

Patches: RookieEnough/De-Vanced/patches-1.6.4.mpp  
[Changelog](https://github.com/RookieEnough/De-Vanced/releases/tag/v1.6.4)

<details><summary>Patches release notes (v1.6.4)</summary>

## [1.6.4](https://github.com/RookieEnough/De-Vanced/compare/v1.6.3...v1.6.4) (2026-11-04)

### 🐛 Bug Fixes

* **Messenger:** Add support for `586.0.0.55.92` ([#177](https://github.com/RookieEnough/De-Vanced/issues/177)) ([17584e2](https://github.com/RookieEnough/De-Vanced/commit/17584e2903e907c1d63b408cbf4201fc7b76a8e0))
* **Strava:** Fix `Overwrite media upload parameters` patch ([7c7a9af](https://github.com/RookieEnough/De-Vanced/commit/7c7a9af6e39c6ea892d4883151e2ddefe52376cc))

</details>

Patches: sashade8-ship-it/dual-vot-patches/patches-2.3.0-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.3.0-dualvot.8.5.4)

<details><summary>Patches release notes (v2.3.0-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.3.0-dualvot.8.5.4

Stable automated update based on Morphe Patches 2.3.0.

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

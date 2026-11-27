Gboard: 18.5.4.993608717-release-arm64-v8a  
YouTube: 21.30.216  
Default Morphe settings for YouTube:  
- morphe_shorts_quality_default_wifi = 1080
- morphe_hide_end_screen_cards = true
- morphe_hide_end_screen_suggested_video = true
- morphe_header_logo = PREMIUM
- morphe_shorts_autoplay = true
- morphe_video_quality_default_wifi = 1080  

Non-root APK requires [MicroG-RE 7.4.0](https://github.com/MorpheApp/MicroG-RE/releases/tag/7.4.0)  
MicroG-RE for arm64-v8a: [microg-7.4.0-icon-arm64-v8a.apk](https://github.com/MorpheApp/MicroG-RE/releases/download/7.4.0/microg-7.4.0-icon-arm64-v8a.apk)  
Use [zygisk-detach](https://github.com/j-hc/zygisk-detach) to detach the YouTube module from Play Store  

Patches: [dual-vot-patches](https://github.com/sashade8-ship-it/dual-vot-patches)  
Builder: [morphe-module](https://github.com/murikbmx/morphe-module), based on [revanced-magisk-module](https://github.com/j-hc/revanced-magisk-module)
  
Patches: jasonwu1994/Gboard-patches/patches-4.5.0.mpp  
[Changelog](https://github.com/jasonwu1994/Gboard-patches/releases/tag/v4.5.0)

<details><summary>Patches release notes (v4.5.0)</summary>

### ✨ New Features

* **Gboard:** **Web Clipboard**: add bidirectional image and screenshot sync. Copy an image or take a screenshot on your phone to see it in the web portal right away, or upload, paste, or drag-and-drop one or multiple images from your browser directly into your phone's clipboard and Gboard clipboard history.
* **Gboard:** **Web Clipboard**: upgrade the image viewer and workspace UI with a fullscreen lightbox featuring fixed full-height left/right navigation edges, a bottom thumbnail filmstrip for quick switching, top-right copy/download/close actions, compact upload previews, a checkerboard backdrop for transparent images, and refined empty states and same-day timestamps.
* **Gboard:** add 11 more languages to the `Patches` settings page: Simplified Chinese, Japanese, Korean, Spanish, Brazilian Portuguese, Russian, German, French, Vietnamese, Indonesian, and Turkish. When **Language** is set to **System default**, the settings page follows your system language if it is supported; you can also pick any of the 13 bundled languages manually. Any text that is not translated yet is shown in English.
* **Gboard:** add 9 more buttons to the `Toolbar Editing Buttons` patch: Forward Delete, Paste as plain text, Home, End, Tab, and the Left, Right, Up, and Down arrow keys.
* **Gboard:** toolbar button labels for `Toolbar Editing Buttons`, `Floating Web Search`, and `Incognito Mode Toggle` now follow the **Language** setting on the `Patches` settings page instead of always showing English.
* **Gboard:** **Clipboard Enhancements** adds an optional **Select All** button at the far left of the clipboard edit toolbar. Enable it under **Patches → Clipboard → General**, where the setting includes a description and preview. **Select All** includes pinned clips by default. Turn on **Exclude pinned clips** to select only unpinned clips, then use Gboard’s built-in **Delete** button to remove the selection.
* **Gboard:** **Backup & Restore** can now export Gboard's own personal data to a ZIP file. You choose what to include: learned words, personal dictionary, blocked suggestions, emoji and GIF history, custom themes, pinned clipboard items, and Gboard settings.
* **Gboard:** **Import Gboard data** restores the items you choose. Before importing, it lists everything that will be replaced. Afterwards, it shows the result for each item and offers **Restart Gboard**. Backups from a newer Gboard are rejected. Only pinned clipboard items are included, and Gboard may ask for contacts access after you restore settings.

### 🐛 Bug Fixes

* **Gboard:** **Web Clipboard**: fix cleared messages reappearing after reloading the page by clearing the phone-hosted latest clipboard snapshot along with the browser thread.
* **Gboard:** **Web Clipboard**: fix message ordering when phone and computer clocks differ by ordering thread items using the browser's local receive time.
* **Gboard:** **Web Clipboard**: fix top action button clipping in the image lightbox, corner border clipping on the drag-and-drop overlay, and potential history entry collisions when uploading multiple images at once.
* **Gboard:** **Toolbar Editing Buttons**: redraw the Select All icon so it no longer looks identical to Gboard's built-in Resize button.
* **Gboard:** **Frosted Glass**: fix an issue where invoking the keyboard could leave the background transparent without blur until you tap a key, by scheduling a single next-frame redraw after a new blur surface is created.

### ✨ 新功能

* **Gboard:** **Web Clipboard**：新增雙向圖片與截圖同步。在手機複製圖片或截圖後會即時顯示在網頁端；在電腦網頁點選、貼上或拖曳單張／多張圖片，也會直接同步到手機系統剪貼簿與 Gboard 剪貼簿歷史中。
* **Gboard:** **Web Clipboard**：優化圖片檢視與介面體驗，包含全新全螢幕圖片預覽燈箱（固定左右全高切換區域、底部所有圖片縮圖預覽列、右上角複製／下載／關閉按鈕）、精簡的待傳圖片列、透明圖片棋盤格底紋，以及更俐落的空狀態與同日時間戳顯示。
* **Gboard:** `Patches` 設定頁新增 11 種語言：簡體中文、日文、韓文、西班牙文、巴西葡萄牙文、俄文、德文、法文、越南文、印尼文與土耳其文。「語言」設為「跟隨系統」時，若系統語言在支援範圍內，設定頁會自動切換；也可以手動選擇任一種內建語言（共 13 種）。尚未翻譯的文字會以英文顯示。
* **Gboard:** `Toolbar Editing Buttons` Patch 新增 9 個按鈕：向前刪除、純文字貼上、行首、行尾、Tab，以及上、下、左、右方向鍵。
* **Gboard:** `Toolbar Editing Buttons`、`Floating Web Search` 與 `Incognito Mode Toggle` 的工具列按鈕文字改為跟隨 `Patches` 設定頁的「語言」設定，不再固定顯示英文。
* **Gboard:** **剪貼簿增強**新增「編輯時新增全選按鈕」，預設關閉。可在 **Patches → 剪貼簿 → 一般**查看說明、預覽並開啟。啟用後，「全選」會出現在編輯工具列最左側，預設包含釘選項目。開啟「排除釘選」後，全選只勾選未釘選項目，再按 Gboard 原生刪除鍵即可批次刪除。
* **Gboard:** **備份與還原**新增 Gboard 個人化資料匯出，可以自選要存進 ZIP 檔的項目：記憶字詞、個人字典、封鎖的建議字詞、表情符號與 GIF 紀錄、自訂主題、已固定的剪貼簿項目和 Gboard 設定。
* **Gboard:** 「匯入 Gboard 資料」可以自選要還原的項目。匯入前會列出所有會被覆蓋的內容，完成後逐項顯示結果，並提供「重新啟動 Gboard」。較新版本 Gboard 的備份無法匯入。剪貼簿只包含已固定的項目；還原 Gboard 設定後，Gboard 可能會要求聯絡人權限。

### 🐛 修復

* **Gboard:** **Web Clipboard**：修復清空對話後重新整理網頁時舊訊息會再次出現的問題，現在清空時會一併重置手機端快取的最新剪貼簿狀態。
* **Gboard:** **Web Clipboard**：修復手機與電腦系統時間存在誤差時訊息排序錯亂的問題，改以電腦端實際收到訊息的時間排序。
* **Gboard:** **Web Clipboard**：修復圖片預覽燈箱頂部按鈕裁切、拖曳上傳外框四角邊線被遮擋，以及連續上傳多張圖片時 Gboard 剪貼簿歷史項目可能互相覆蓋的問題。
* **Gboard:** **Toolbar Editing Buttons**：重新繪製「全選」圖示，不再與 Gboard 內建的「調整大小」按鈕完全相同。
* **Gboard:** **磨砂玻璃**：修復開啟鍵盤時背景可能只剩透明、沒有顯示模糊效果，必須按下任意按鍵後才恢復的問題；現在建立新的模糊表面後會自動補排一次下一幀重繪。

</details>

CLI: MorpheApp/morphe-cli/morphe-desktop-2.4.0-all.jar  
Patches: sashade8-ship-it/dual-vot-patches/patches-2.4.0-dualvot.8.5.4.mpp  
[Changelog](https://github.com/sashade8-ship-it/dual-vot-patches/releases/tag/v2.4.0-dualvot.8.5.4)

<details><summary>Patches release notes (v2.4.0-dualvot.8.5.4)</summary>

## Dual VoT Patches 2.4.0-dualvot.8.5.4

Stable automated update based on Morphe Patches 2.4.0.

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

Skipped:  
GooglePhotos: RookieEnough/De-Vanced/patches-1.6.4.mpp
ProtonVPN: hxreborn/morphe-patches/patches-1.88.0.mpp  

Без изменений, перенесено из релиза 31:  
- gboard-lite-kveld-v18.6.3.1002251336-lite_release-arm64-v8a.apk  
- googlephotos-devanced-module-v7.92.0.977185651-arm64-v8a.zip  
- googlephotos-devanced-v7.92.0.977185651-arm64-v8a.apk  
- proton-vpn-hxreborn-v5.21.9.0-arm64-v8a.apk  

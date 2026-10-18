# Minimal IP Widget

A tiny, text-only Android home-screen widget displaying `127.0.0.1`.

- Transparent background
- White monospace text
- No launcher activity or regular app screen
- Supports launcher resizing
- No internet permission and no tracking

## Build on your phone

1. Install a reputable Android IDE/build app that supports importing Gradle Android projects (for example, AndroidIDE if compatible with your Android version and available to you).
2. Extract this ZIP.
3. Open/import the extracted `MinimalIPWidget` project in the IDE.
4. Allow Gradle sync and download the Android Gradle Plugin/SDK components if prompted. This requires internet and may take time.
5. Build an APK, install it, then long-press your home screen and open Widgets.
6. Find **Minimal IP Widget**, add it, then resize it to the smallest layout that fits.

If the IDE asks for a JDK, use JDK 17.

## Notes

- This is source code, not a precompiled APK.
- Vivo's launcher decides the exact grid footprint and may show a widget label in the widget picker. The widget itself contains only the IP text.
- `127.0.0.1` is a real loopback address, not a dummy external IP. It means “this device.”

## Build without a laptop using GitHub Actions

This ZIP includes a workflow at `.github/workflows/build-apk.yml`.

1. On your phone, create a new GitHub repository.
2. Upload the extracted project files and folders to the repository's `main` branch. Make sure the `.github/workflows/build-apk.yml` file is included.
3. Open the repository's **Actions** tab and allow workflows if GitHub asks.
4. Open **Build Android widget APK** and select **Run workflow** (or wait for the first push build).
5. When the run completes, open it and download the `minimal-ip-widget-apk` artifact.
6. Extract the downloaded artifact ZIP to get `app-debug.apk`, install it, then add the widget from your Vivo home-screen Widgets menu.

GitHub may require you to upload files through its website or use a mobile Git client. Do not upload signing keys or secrets; this is a debug APK for personal use.

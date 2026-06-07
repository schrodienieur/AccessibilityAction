# [takeScreenshot](/code/others/takeScreenshot.bsh)

Capture screenshots of a display, window, or specific node. Returns a lazy `ScreenshotHelper` object for analysis and saving, or a convenience saved-file path when using the overloads that accept a `path`.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md) — requires the accessibility service to be running.

&nbsp;
# How it works
`takeScreenshot` wraps Android's accessibility screenshot APIs. The main signature is:

```java
This takeScreenshot(int windowId, int displayId, AccessibilityNodeInfo node)
```

- If `node` is provided the function will use the node's window and display and crop the captured image to the node's bounds.
- If `windowId` is >= 0 the method captures that specific window; otherwise it captures the specified `displayId`.
- The call is executed asynchronously under the hood but the provided helper object is returned synchronously (the function blocks until the screenshot is ready).

The returned `ScreenshotHelper` (a `This` BeanShell object) exposes helpers:

- `saveTo(String path)` → Save the screenshot PNG to the given path and return the saved `File`.
- `recycle()` → Free bitmap resources.
- `getBitmap()` → Get the `Bitmap` instance.
- `getPixelColor(int x, int y)` → Return the pixel color at the given coordinates.

There are convenience overloads that automatically save the screenshot and return the saved file path as a `String`:

```java
String takeScreenshot(String path)
String takeScreenshot(int displayId, String path)
String takeScreenshot(AccessibilityNodeInfo node, String path)
// and others that accept windowId/displayId/node + path
```

The function throws a `JavaCodeException` when the accessibility service is not available and will log errors if screenshot capture fails.

&nbsp;
# How to use

**Capture and get helper (crop to a node):**
```java
This helper = takeScreenshot(node);
helper.saveTo("/sdcard/node.png");
helper.recycle();
```

**Capture and auto-save (default display):**
```java
path = takeScreenshot("/sdcard/screenshot.png");
```

**Capture a specific display and inspect a pixel:**
```java
This helper = takeScreenshot(1); // get helper for display 1
int color = helper.getPixelColor(10, 10);
helper.recycle();
```

&nbsp;
## Return Value
- `This` (ScreenshotHelper) for the core overloads — provides `saveTo`, `getBitmap`, `getPixelColor`, and `recycle`.
- `String` (file path) for convenience overloads that accept a `path` and auto-save the screenshot.

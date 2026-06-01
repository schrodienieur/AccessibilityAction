# [takeWindowScreenshot](/code/others/takeWindowScreenshot.bsh)

Capture a screenshot of a specific accessibility window and save it to a file.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`takeWindowScreenshot` requests a window screenshot from the accessibility service and saves the PNG output to the given destination path.

&nbsp;
# How to use

**Capture a window screenshot:**
```
path = takeWindowScreenshot(windowId, "/sdcard/window.png");
```

&nbsp;
## Return Value
Returns the saved screenshot file path as a `String`.

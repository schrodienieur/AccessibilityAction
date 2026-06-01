# [takeScreenshot](/code/others/takeScreenshot.bsh)

Capture a screenshot of a display and save it to a file.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`takeScreenshot` requests a display screenshot through the accessibility service and saves the resulting PNG file to the specified path.

&nbsp;
# How to use

**Capture the default display:**
```
path = takeScreenshot(0, "/sdcard/screenshot.png");
```

&nbsp;
## Return Value
Returns the saved screenshot file path as a `String`.

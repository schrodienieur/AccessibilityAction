# [getFocusedWindow](/code/main/getFocusedWindow.bsh)

Return the currently focused accessibility window for a display.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`getFocusedWindow` retrieves window information from the accessibility service for a specified display. It returns the focused window when available, or the first application window if no focused window is found.

&nbsp;
# How to use

**Get the focused window on the default display:**
```
window = getFocusedWindow();
```

&nbsp;
**Get the focused window on display 1:**
```
window = getFocusedWindow(1);
```

&nbsp;
**Get the focused window from a Display object:**
```
window = getFocusedWindow(display);
```

&nbsp;
## Return Value
Returns an `AccessibilityWindowInfo` object for the focused window, or `null` if none is found.

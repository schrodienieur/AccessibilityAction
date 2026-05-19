# [setDisplayByPackageName](/code/main/setDisplayByPackageName.bsh)

Set the target display by locating an application's active window.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`setDisplayByPackageName` scans all displays and their application windows to find the first active window belonging to the specified package. Once found, it sets the global `DISPLAY_ID` variable to that display's ID.

&nbsp;
# How to use

**Set display by app package:**
```
setDisplayByPackageName("com.android.settings");
```

&nbsp;
**Switch to another app's display:**
```
setDisplayByPackageName("com.whatsapp");
```

&nbsp;
## Return Value
Returns the display ID as an `int` if the app is found, or `0` if not found or on error.

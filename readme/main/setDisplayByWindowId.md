# [setDisplayByWindowId](/code/main/setDisplayByWindowId.bsh)

Set the target display by locating a specific window ID.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`setDisplayByWindowId` scans all displays and their windows to find a window matching the provided window ID. Once found, it sets the global `DISPLAY_ID` variable to that display's ID.

&nbsp;
# How to use

**Set display by window ID:**
```java
setDisplayByWindowId(1234);
```

&nbsp;
## Return Value
None. Sets the global `DISPLAY_ID` variable if the window is found.

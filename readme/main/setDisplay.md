# [setDisplay](/code/main/setDisplay.bsh)

Set the target display by ID or find and set by display name.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`setDisplay` has two modes:
- **By ID**: Directly sets the global `DISPLAY_ID` variable to the specified display ID
- **By Name**: Searches all system displays for a name match (case-insensitive, partial matching) and sets the global `DISPLAY_ID` if found

&nbsp;
# How to use

**Set display by ID:**
```
setDisplay(1);
```

&nbsp;
**Find and set display by name:**
```
setDisplay("HDMI");
```

&nbsp;
**Reset to default display:**
```
setDisplay(0);
```

&nbsp;
## Return Value
Returns the display ID as an `int` if successful, or `0` if not found or on error.

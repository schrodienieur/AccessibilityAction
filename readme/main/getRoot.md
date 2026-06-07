# [getRoot](/code/main/getRoot.bsh)

Get the root accessibility node for the active window.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`getRoot` returns the active window root node for the current display. If a global display ID is set, it chooses the active window for that display.

&nbsp;
# How to use

**Get the active window root:**
```java
root = getRoot();
```

&nbsp;
**Use a specific display ID:**
```java
DISPLAY_ID = 1;
root = getRoot();
```

&nbsp;
## Return Value
Returns an `AccessibilityNodeInfo` root node, or `null` if no active window root is available.
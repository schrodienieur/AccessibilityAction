# [splitScreen](/code/global/splitScreen.bsh)

Toggle split-screen mode.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`splitScreen` gets the current `AccessibilityService` instance and executes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN)`.

&nbsp;
# How to use

```java
splitScreen();
```

&nbsp;
## Return Value
No return value.

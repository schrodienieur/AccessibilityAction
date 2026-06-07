# [lockScreen](/code/global/lockScreen.bsh)

Lock the device screen.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`lockScreen` obtains the current `AccessibilityService` instance and performs `performGlobalAction(AccessibilityService.GLOBAL_ACTION_LOCK_SCREEN)`.

&nbsp;
# How to use

```java
lockScreen();
```

&nbsp;
## Return Value
No return value.

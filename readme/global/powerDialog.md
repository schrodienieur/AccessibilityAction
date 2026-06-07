# [powerDialog](/code/global/powerDialog.bsh)

Open the power dialog.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`powerDialog` retrieves the current `AccessibilityService` instance and executes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_POWER_DIALOG)`.

&nbsp;
# How to use

```java
powerDialog();
```

&nbsp;
## Return Value
No return value.

# [back](/code/global/back.bsh)

Perform the device back action.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`back` retrieves the current `AccessibilityService` instance and calls `performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK)`.

&nbsp;
# How to use

```java
back();
```

&nbsp;
## Return Value
No return value.

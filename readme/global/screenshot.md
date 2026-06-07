# [screenshot](/code/global/screenshot.bsh)

Take a screenshot.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`screenshot` retrieves the current `AccessibilityService` instance and performs `performGlobalAction(AccessibilityService.GLOBAL_ACTION_TAKE_SCREENSHOT)`.

&nbsp;
# How to use

```java
screenshot();
```

&nbsp;
## Return Value
No return value.

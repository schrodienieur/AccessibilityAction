# [a11yButton](/code/global/a11yButton.bsh)

toggle the system accessibility button.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`a11yButton` retrieves the current `AccessibilityService` instance via `getService()` and invokes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_BUTTON)`.

&nbsp;
# How to use

```java
a11yButton();
```

&nbsp;
## Return Value
No return value.

# [a11yShortcut](/code/global/a11yShortcut.bsh)

Trigger the accessibility shortcut action.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`a11yShortcut` retrieves the current `AccessibilityService` instance and executes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_SHORTCUT)`.

&nbsp;
# How to use

```java
a11yShortcut();
```

&nbsp;
## Return Value
No return value.

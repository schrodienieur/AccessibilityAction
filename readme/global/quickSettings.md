# [quickSettings](/code/global/quickSettings.bsh)

Open the quick settings panel.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`quickSettings` gets the current `AccessibilityService` instance and performs `performGlobalAction(AccessibilityService.GLOBAL_ACTION_QUICK_SETTINGS)`.

&nbsp;
# How to use

```java
quickSettings();
```

&nbsp;
## Return Value
No return value.

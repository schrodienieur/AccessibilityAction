# [allApps](/code/global/allApps.bsh)

Open the system all-apps overview.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`allApps` obtains the `AccessibilityService` instance and calls `performGlobalAction(AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_ALL_APPS)`.

&nbsp;
# How to use

```java
allApps();
```

&nbsp;
## Return Value
No return value.

# [recents](/code/global/recents.bsh)

Open the recent apps view.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`recents` retrieves the current `AccessibilityService` instance and calls `performGlobalAction(AccessibilityService.GLOBAL_ACTION_RECENTS)`.

&nbsp;
# How to use

```java
recents();
```

&nbsp;
## Return Value
No return value.

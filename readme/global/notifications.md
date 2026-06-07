# [notifications](/code/global/notifications.bsh)

Open the notification shade.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`notifications` gets the current `AccessibilityService` instance and invokes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_NOTIFICATIONS)`.

&nbsp;
# How to use

```java
notifications();
```

&nbsp;
## Return Value
No return value.

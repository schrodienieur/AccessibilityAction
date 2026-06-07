# [dismiss](/code/global/dismiss.bsh)

Dismiss the notification shade.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`dismiss` obtains the `AccessibilityService` instance and executes `performGlobalAction(AccessibilityService.GLOBAL_ACTION_DISMISS_NOTIFICATION_SHADE)`.

&nbsp;
# How to use

```java
dismiss();
```

&nbsp;
## Return Value
No return value.

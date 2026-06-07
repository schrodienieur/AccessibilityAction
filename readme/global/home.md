# [home](/code/global/home.bsh)

Go to the device home screen.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`home` gets the current `AccessibilityService` instance and performs `performGlobalAction(AccessibilityService.GLOBAL_ACTION_HOME)`.

&nbsp;
# How to use

```java
home();
```

&nbsp;
## Return Value
No return value.

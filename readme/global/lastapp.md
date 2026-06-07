# [lastapp](/code/global/lastapp.bsh)

Switch to the last-used app.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)
1. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`lastapp` retrieves the current `AccessibilityService` instance, sends the recents action twice, and waits 50ms between calls to switch to the previous app.

&nbsp;
# How to use

```java
lastapp();
```

&nbsp;
## Return Value
No return value.

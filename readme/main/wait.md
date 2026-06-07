# [wait](/code/main/wait.bsh)

Pause execution for a specified duration.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`wait` suspends script execution for the given number of milliseconds. In Tasker it uses RxJava timing, and in MacroDroid it uses `Thread.sleep()`.

&nbsp;
# How to use

**Wait for half a second:**
```java
wait(500);
```

&nbsp;
## Return Value
This helper does not return a value; it only delays execution.
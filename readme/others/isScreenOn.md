# [isScreenOn](/code/others/isScreenOn.bsh)

Check whether the display is currently turned on.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`isScreenOn` queries the display manager to determine whether a display's state is `STATE_ON`. It supports the default display and accepts a display ID when needed.

&nbsp;
# How to use

**Check the default display:**
```java
on = isScreenOn();
```

&nbsp;
**Check a specific display:**
```java
on = isScreenOn(1);
```

&nbsp;
## Return Value
Returns `true` when the display is on, otherwise `false`.

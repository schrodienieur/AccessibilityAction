# [isLocked](/code/others/isLocked.bsh)

Check whether the device is currently locked.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`isLocked` queries the system keyguard service to determine whether the device is currently locked.

&nbsp;
# How to use

**Check lock state:**
```
locked = isLocked();
```

&nbsp;
## Return Value
Returns `true` if the device is currently locked, otherwise `false`.

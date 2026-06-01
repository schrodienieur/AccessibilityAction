# [screen](/code/others/screen.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Control screen power state via accessibility service.

&nbsp;
# How it works
`screen` uses different mechanisms based on the desired state:
- **Turn ON**: Uses PowerManager with `FULL_WAKE_LOCK` and `ACQUIRE_CAUSES_WAKEUP` flags
- **Turn OFF**: Uses AccessibilityService's `GLOBAL_ACTION_LOCK_SCREEN`

&nbsp;
# How to use

**Wake the screen:**
```
screen(true);
```

&nbsp;
**Lock or turn off the screen:**
```
screen(false);
```

&nbsp;
## Return Value
None. Action is performed immediately.

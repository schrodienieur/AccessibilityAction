# [globalAction](/code/others/globalAction.java)

Perform global accessibility actions through the accessibility service.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)

&nbsp;
# How it works
`globalAction` exposes a collection of global action methods such as back, home, recents, notifications, quick settings, lock screen, split screen, and screenshot. Each action is dispatched directly through the accessibility service.

&nbsp;
# How to use

**Return to the previous screen:**
```
back();
```

&nbsp;
**Open the home screen:**
```
home();
```

&nbsp;
**Take a screenshot:**
```
screenshot();
```

&nbsp;
## Return Value
None. Actions are executed through the accessibility service.

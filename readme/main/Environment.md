# [Environment](/code/main/Environment.bsh)

Detect the current automation environment and expose environment flags.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`Environment` detects whether the script is running inside Tasker, MacroDroid, or another host app. It also checks for Material theme support and exposes helper fields and methods such as `currentType`, `currentName`, `packageName`, `isTasker()`, and `hasMaterialColor()`.

&nbsp;
# How to use

**Get the current environment object:**
```
env = Environment();
```

&nbsp;
**Check for Tasker:**
```
if (env.isTasker()) {
    // ...
}
```

&nbsp;
## Return Value
Returns an environment object containing `currentType`, `currentName`, `packageName`, and helper methods for environment checks.

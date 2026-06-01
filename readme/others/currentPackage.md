# [currentPackage](/code/others/currentPackage.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Get the package name of the currently active application.

&nbsp;
# How it works
`currentPackage` calls `getUsageEvents()` and retrieves the `packageName` field from the latest usage event to determine the foreground application.

&nbsp;
# How to use

**Get current package name:**
```
pkg = currentPackage();
```

&nbsp;
## Return Value
Returns the package name as a `String` (e.g., "com.android.systemui"), or `null` if no usage events are available.

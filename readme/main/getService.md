# [getService](/code/main/getService.bsh)

Get the accessibility service instance.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getService` returns Tasker's accessibility service when running in the Tasker environment. It throws an exception if the service is unavailable.

&nbsp;
# How to use

**Fetch the accessibility service:**
```
service = getService();
```

&nbsp;
## Return Value
Returns an `AccessibilityService` instance, or throws if the service is not active.
# [openApp](/code/others/openApp.bsh)

Launch an application by package name, label, or specific activity.

&nbsp;
# Dependencies
1. [PackageManager](/readme/others/PackageManager.md)

&nbsp;
# How it works
`openApp` provides multiple ways to launch applications:
- By package and activity names (specific component)
- By app label or package name (uses default launch intent)
- In background mode (launches without bringing app to foreground)

Supports multi-display scenarios when `DISPLAY_ID` is set.

&nbsp;
# How to use

**Launch app by package name:**
```java
openApp("com.android.chrome");
```

&nbsp;
**Launch app by label:**
```java
openApp("Chrome");
```

&nbsp;
**Launch specific activity:**
```java
openApp("com.android.chrome", "com.android.chrome.MainActivity");
```

&nbsp;
**Launch app in background:**
```java
openApp("com.whatsapp", true);
```

&nbsp;
## Return Value
None. Application is launched asynchronously. Failures are logged to the log file.

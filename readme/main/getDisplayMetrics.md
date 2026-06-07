# [getDisplayMetrics](/code/main/getDisplayMetrics.bsh)

Get display metrics for a screen.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getDisplayMetrics` retrieves the real width and height for a display ID using the Android `DisplayManager`. Without arguments, it uses the currently selected global display ID.

&nbsp;
# How to use

**Get metrics for display 0:**
```java
dm = getDisplayMetrics(0);
```

&nbsp;
**Get metrics for the current display:**
```java
dm = getDisplayMetrics();
```

&nbsp;
## Return Value
Returns a `DisplayMetrics` object containing `widthPixels` and `heightPixels`, or `null` if the display is unavailable.
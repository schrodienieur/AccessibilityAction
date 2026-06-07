# [tapShizuku](/code/gestures/tapShizuku.bsh)

Perform a low-level tap injection using Shizuku.

&nbsp;
# Dependencies
1. [getContext](/readme/main/getContext.md)
2. [getDisplayMetrics](/readme/main/getDisplayMetrics.md)
3. [setDisplayId](/readme/main/setDisplayId.md)

&nbsp;
# How it works
`tapShizuku` normalizes coordinates to screen pixels and injects `MotionEvent` ACTION_DOWN and ACTION_UP events through the Shizuku input manager. It is a direct tap implementation that works when accessibility gestures are not available.

&nbsp;
# How to use

**Simple normalized tap:**
```java
tapShizuku(0.5, 0.5);
```

&nbsp;
**Tap with explicit duration:**
```java
tapShizuku(0.5, 0.5, 100);
```

&nbsp;
**Tap using absolute pixel coordinates:**
```java
tapShizuku(200, 400, 50);
```

&nbsp;
**Default fast tap:**
```java
tapShizuku(200, 400);
```

&nbsp;
## Return Value
Returns `true` if the Shizuku tap injection succeeds, or `false` if it fails.
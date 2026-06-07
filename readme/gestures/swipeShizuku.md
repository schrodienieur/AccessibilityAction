# [swipeShizuku](/code/gestures/swipeShizuku.bsh)

Perform a swipe gesture by injecting touch events through Shizuku.

&nbsp;
# Dependencies
1. [getContext](/readme/main/getContext.md)
2. [getDisplayMetrics](/readme/main/getDisplayMetrics.md)
3. [setDisplayId](/readme/main/setDisplayId.md)

&nbsp;
# How it works
`swipeShizuku` sends a down event, interpolated move events, and an up event through the Shizuku input manager. It accepts normalized or absolute coordinates, and the `stopFlick` flag optionally pauses at the end to reduce swipe momentum. Overloads also support center-screen vertical swipes.

&nbsp;
# How to use

**Direct Shizuku swipe:**
```java
swipeShizuku(0.5, 0.8, 0.5, 0.2, 300);
```

&nbsp;
**Shizuku swipe with momentum control:**
```java
swipeShizuku(0.5, 0.8, 0.5, 0.2, 300, true);
```

&nbsp;
**Vertical center swipe shortcut:**
```java
swipeShizuku(0.8, 0.2);
```

&nbsp;
**Vertical swipe with custom duration and no stop flick:**
```java
swipeShizuku(0.8, 0.2, 400);
```

&nbsp;
## Return Value
Returns `true` when the injected swipe is successful, or `false` if it fails.
# [tap](/code/gestures/tap.bsh)

Dispatch a tap gesture using accessibility service or fallback to Shizuku when needed.

&nbsp;
# Dependencies
1. [getContext](/readme/main/getContext.md)
2. [getCoordinates](/readme/main/getCoordinates.md)
3. [getDisplayMetrics](/readme/main/getDisplayMetrics.md)
4. [getNode](/readme/main/getNode.md)
5. [getRoot](/readme/main/getRoot.md)
6. [getService](/readme/main/getService.md)
7. [setDisplayId](/readme/main/setDisplayId.md)
8. [tapShizuku](/readme/gestures/tapShizuku.md)
9. [toNode](/readme/main/toNode.md)

&nbsp;
# How it works
`tap` first tries to perform the gesture through the accessibility service. If the active window root is unavailable, it falls back to `tapShizuku`. It supports screen coordinates, `AccessibilityNodeInfo`, node collections, and text/key-value search overloads.

&nbsp;
# How to use

**Tap by screen percentage:**
```
tap(0.5, 0.5);
```

&nbsp;
**Tap with a custom hold duration:**
```
tap(0.5, 0.5, 100);
```

&nbsp;
**Tap by visible text label:**
```
tap("Login");
```

&nbsp;
**Tap by resource id:**
```
tap(identifierKey, "com.example:id/login_button");
```

&nbsp;
**Tap a node object:**
```
AccessibilityNodeInfo node = getNode(getRoot(), "text", "Submit", 0);
tap(node);
```

&nbsp;
## Return Value
Returns `true` if the tap gesture is dispatched successfully, otherwise `false`.
# [scrollForward](/code/actions/scrollForward.bsh)

Scroll a scrollable container forward (down or right).

&nbsp;
# Dependencies
1. [findScrollableNode](/readme/main/findScrollableNode.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`scrollForward` finds a scrollable node and performs `ACTION_SCROLL_FORWARD`. It can act on an explicitly provided node or discover the first scrollable container in the active window.

&nbsp;
# How to use

**Scroll the first scrollable container forward:**
```java
scrollForward();
```

&nbsp;
**Scroll a specific node forward:**
```java
scrollForward(node);
```

&nbsp;
**Scroll by selector:**
```java
scrollForward("text", "Messages", 0);
```

&nbsp;
## Return Value
Returns the scrolled `AccessibilityNodeInfo`, or `false` if no scrollable container was found.
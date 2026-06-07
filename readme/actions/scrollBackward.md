# [scrollBackward](/code/actions/scrollBackward.bsh)

Scroll a scrollable container backward (up or left).

&nbsp;
# Dependencies
1. [findScrollableNode](/readme/main/findScrollableNode.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`scrollBackward` finds a scrollable node and performs `ACTION_SCROLL_BACKWARD`. If no node is provided, it searches the active root for the first scrollable container on screen.

&nbsp;
# How to use

**Scroll the first scrollable container backward:**
```java
scrollBackward();
```

&nbsp;
**Scroll a specific node backward:**
```java
scrollBackward(node);
```

&nbsp;
**Scroll by selector:**
```java
scrollBackward("text", "Settings", 0);
```

&nbsp;
## Return Value
Returns the scrolled `AccessibilityNodeInfo`, or `false` if no scrollable container was found.
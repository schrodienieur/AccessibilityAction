# [scrollInDirection](/code/actions/scrollInDirection.bsh)

Scroll a node in a specific direction.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [toNode](/readme/main/toNode.md)
3. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`scrollInDirection` determines a direction from a string or numeric constant and sends `ACTION_SCROLL_IN_DIRECTION` to the nearest scrollable ancestor of the target node. It supports nodes, collections, maps, and selector-based lookup.

&nbsp;
# How to use

**Scroll down a list item:**
```java
scrollInDirection("text", "Item 5", "down");
```

&nbsp;
**Scroll up a specific node:**
```java
scrollInDirection(node, "up");
```

&nbsp;
**Scroll forward using a resource id:**
```java
scrollInDirection(identifierKey, "com.example:id/list", "forward");
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` that received the scroll action, or `false` if the action failed.
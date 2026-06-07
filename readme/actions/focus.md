# [focus](/code/actions/focus.bsh)

Request input focus on a target node.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [toNode](/readme/main/toNode.md)
5. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`focus` finds a node using node objects, collections, maps, or selectors, then performs `ACTION_FOCUS`. It also refreshes the node and can focus the first matching item or a node relative to a custom root.

&nbsp;
# How to use

**Focus by text label:**
```java
focus("Password Field");
```

&nbsp;
**Focus by attribute:**
```java
focus(identifierKey, "com.example:id/input");
```

&nbsp;
**Focus a node object:**
```java
focus(node);
```

&nbsp;
## Return Value
Returns the focused `AccessibilityNodeInfo`, or `null` if no matching node was found.
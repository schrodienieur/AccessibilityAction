# [findScrollableNode](/code/main/findScrollableNode.bsh)

Locate the first scrollable node in a subtree.

&nbsp;
# Dependencies
1. [getRoot](/readme/main/getRoot.md)

&nbsp;
# How it works
`findScrollableNode` searches downward from a start node until it finds a node with `isScrollable()` true. It returns the first scrollable container it encounters.

&nbsp;
# How to use

**Find the first scrollable container on screen:**
```java
scrollNode = findScrollableNode(getRoot());
```

&nbsp;
**Find a scrollable child under a specific node:**
```java
scrollNode = findScrollableNode(formSection);
```

&nbsp;
## Return Value
Returns an `AccessibilityNodeInfo` for the first scrollable node, or `null` if none exists.
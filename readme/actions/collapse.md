# [collapse](/code/actions/collapse.bsh)

Collapse an expandable node or its parent container.

&nbsp;
# Dependencies
1. [findExpandableChild](/readme/main/findExpandableChild.md)
2. [getNode](/readme/main/getNode.md)
3. [isExpandable](/readme/main/isExpandable.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [toNode](/readme/main/toNode.md)
6. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`collapse` searches for an expandable node and triggers `ACTION_COLLAPSE`. It can climb parent nodes or inspect child nodes based on the `checkparent` flag, and supports collections and maps.

&nbsp;
# How to use

**Collapse by text selector:**
```java
collapse("text", "Details", 0, true);
```

&nbsp;
**Collapse a node directly:**
```java
collapse(node, 0, true);
```

&nbsp;
**Collapse using a node collection:**
```java
collapse(nodes, 1, false);
```

&nbsp;
## Return Value
Returns the collapsed `AccessibilityNodeInfo`, or `null` if no expandable node was found.
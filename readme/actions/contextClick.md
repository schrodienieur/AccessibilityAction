# [contextClick](/code/actions/contextClick.bsh)

Perform a context click (secondary click) on a target node.

&nbsp;
# Dependencies
1. [click](/readme/actions/click.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [toNode](/readme/main/toNode.md)
6. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`contextClick` locates a node by object, collection, map, or selector and performs `ACTION_CONTEXT_CLICK`. It refreshes the node afterward and supports timeout and root-relative search variants.

&nbsp;
# How to use

**Context click by visible text:**
```java
contextClick("Options");
```

&nbsp;
**Context click by resource id:**
```java
contextClick(identifierKey, "com.example:id/item", 0);
```

&nbsp;
**Context click a node directly:**
```java
contextClick(node);
```

&nbsp;
## Return Value
Returns the context-clicked `AccessibilityNodeInfo`, or `null` if the target was not found.
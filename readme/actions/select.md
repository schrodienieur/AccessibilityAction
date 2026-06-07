# [select](/code/actions/select.bsh)

Select a target node item.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [toNode](/readme/main/toNode.md)
5. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`select` performs `ACTION_SELECT` on a node. It supports direct node references, collections, maps, text selectors, key/value selectors, and context-based node lookup.

&nbsp;
# How to use

**Select by visible text:**
```java
select("Option 1");
```

&nbsp;
**Select by attribute:**
```java
select(identifierKey, "com.example:id/tab", 0);
```

&nbsp;
**Select the currently focused node:**
```java
select();
```

&nbsp;
## Return Value
Returns the selected `AccessibilityNodeInfo`, or `null` when the node cannot be found.
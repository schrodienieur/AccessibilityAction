# [setSelection](/code/actions/setSelection.bsh)

Set a text selection range or cursor position in an input node.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [getText](/readme/main/getText.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [toNode](/readme/main/toNode.md)
6. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`setSelection` locates a node and performs `ACTION_SET_SELECTION` with start and end positions. It supports direct nodes, collections, maps, selectors, current focus, and root-relative search.

&nbsp;
# How to use

**Select text by visible label:**
```java
setSelection("Message", 0, 5);
```

&nbsp;
**Move cursor to the end of the current field:**
```java
setSelection(0, -1);
```

&nbsp;
**Set selection on a specific node object:**
```java
setSelection(node, 3, 8);
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` where selection was set, or `null` if the node was not found.
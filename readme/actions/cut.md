# [cut](/code/actions/cut.bsh)

Cut selected text from a target node to the clipboard.

&nbsp;
# Dependencies
1. [copy](/readme/actions/copy.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [toNode](/readme/main/toNode.md)
6. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`cut` locates an editable node and performs `ACTION_CUT`. It supports direct node references, collections, maps, selectors, and cutting from the currently focused input field.

&nbsp;
# How to use

**Cut by text label:**
```java
cut("Notes");
```

&nbsp;
**Cut by attribute selector:**
```java
cut(identifierKey, "com.example:id/message");
```

&nbsp;
**Cut from current focus:**
```java
cut();
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` where the cut occurred, or `null` if the node was not found.
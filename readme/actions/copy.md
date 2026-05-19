# [copy](/code/actions/copy.bsh)

Copy text from a target node to the clipboard.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [toNode](/readme/main/toNode.md)
5. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`copy` finds a node using node objects, collections, maps, or selectors and performs `ACTION_COPY`. It also supports copying from the currently focused input field.

&nbsp;
# How to use

**Copy by text label:**
```
copy("Username");
```

&nbsp;
**Copy by resource id:**
```
copy(identifierKey, "com.example:id/input");
```

&nbsp;
**Copy the currently focused field:**
```
copy();
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` that was copied from, or `null` if no node was found.
# [paste](/code/actions/paste.bsh)

Paste clipboard content into a target editable node.

&nbsp;
# Dependencies
1. [focus](/readme/actions/focus.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [toNode](/readme/main/toNode.md)
6. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`paste` finds an editable node, focuses it if needed, and performs `ACTION_PASTE`. It supports direct nodes, selectors, collections, maps, and pasting into the current focus.

&nbsp;
# How to use

**Paste by visible label:**
```
paste("Message");
```

&nbsp;
**Paste by attribute selector:**
```
paste(identifierKey, "com.example:id/input_field");
```

&nbsp;
**Paste into the currently focused input:**
```
paste();
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` where paste was performed, or `null` if the target was not found.
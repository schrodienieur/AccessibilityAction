# [setText](/code/actions/setText.bsh)

Set the text value of an editable node.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [showOnScreen](/readme/actions/showOnScreen.md)
3. [toNode](/readme/main/toNode.md)
4. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`setText` locates an editable node and uses `ACTION_SET_TEXT` to replace its value. It supports direct node references, collections, maps, visible text search, attribute lookups, and selection based on parent/sibling context.

&nbsp;
# How to use

**Set text by visible label:**
```
setText("Email", "user@example.com");
```

&nbsp;
**Set text by resource id:**
```
setText(identifierKey, "com.example:id/input", "12345");
```

&nbsp;
**Set text in the currently focused field:**
```
setText("Hello world");
```

&nbsp;
## Return Value
Returns the updated `AccessibilityNodeInfo`, or `null` if the node could not be found.
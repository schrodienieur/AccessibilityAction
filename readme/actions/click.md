# [click](/code/actions/click.bsh)

Click a target node or its closest clickable parent.

&nbsp;
# Dependencies
1. [getCoordinates](/readme/main/getCoordinates.md)
2. [getNode](/readme/main/getNode.md)
3. [getRoot](/readme/main/getRoot.md)
4. [showOnScreen](/readme/actions/showOnScreen.md)
5. [tap](/readme/gestures/tap.md)
6. [toNode](/readme/main/toNode.md)
7. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`click` locates a target node using node objects, text or attribute selectors, arrays, or maps. If the node itself is not clickable, it walks up to the nearest clickable ancestor. It can also tap coordinates directly.

&nbsp;
# How to use

**Click by text:**
```
click("Login");
```

&nbsp;
**Click by resource-id:**
```
click(identifierKey, "com.example:id/submit_button");
```

&nbsp;
**Click a node from a collection:**
```
click(nodes, 2);
```

&nbsp;
**Click at screen coordinates:**
```
click(0.5, 0.7);
```

&nbsp;
## Return Value
Returns the clicked `AccessibilityNodeInfo` when successful, or `null` if the node could not be clicked.
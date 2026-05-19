# [longClick](/code/actions/longClick.bsh)

Perform a long press on a target node or its long-clickable ancestor.

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
`longClick` locates a target node and searches upward for a node that supports long-click. If no explicit long-click action exists, it can fall back to a long tap gesture. It supports node objects, collections, maps, selectors, and root-relative searches.

&nbsp;
# How to use

**Long click by text:**
```
longClick("Item 1");
```

&nbsp;
**Long click by resource id:**
```
longClick(identifierKey, "com.example:id/icon", 0);
```

&nbsp;
**Long click the currently focused node:**
```
longClick();
```

&nbsp;
## Return Value
Returns the long-clicked `AccessibilityNodeInfo`, or `null` if no suitable node was available.
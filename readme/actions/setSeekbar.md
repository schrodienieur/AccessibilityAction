# [setSeekbar](/code/actions/setSeekbar.bsh)

Set progress on a seek bar or range node.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [toNode](/readme/main/toNode.md)
5. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`setSeekbar` locates a seekable node and uses `ACTION_SET_PROGRESS` to apply a float progress value or an integer percentage. It supports node objects, collections, maps, text selectors, key/value selectors, and root-relative node discovery.

&nbsp;
# How to use

**Set exact progress on a seek bar:**
```
setSeekbar("Volume", 0.7);
```

&nbsp;
**Set progress by percentage:**
```
setSeekbar(identifierKey, "com.example:id/slider", 50);
```

&nbsp;
**Set progress on a node object:**
```
setSeekbar(node, 0.45);
```

&nbsp;
## Return Value
Returns the updated `AccessibilityNodeInfo`, or `null` if the target seek bar was not found.
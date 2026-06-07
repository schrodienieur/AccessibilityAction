# [isExpandable](/code/main/isExpandable.bsh)

Determine whether a node supports expand or collapse actions.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`isExpandable` checks the node's action list for `ACTION_EXPAND` or `ACTION_COLLAPSE` and returns `true` if either is present.

&nbsp;
# How to use

**Check a node before collapsing:**
```java
if (isExpandable(node)) {
  node.performAction(AccessibilityNodeInfo.ACTION_COLLAPSE);
}
```

&nbsp;
## Return Value
Returns `true` when the node supports an expandable/collapsible action, otherwise `false`.
# [findExpandableChild](/code/main/findExpandableChild.bsh)

Find the first expandable child node in a subtree.

&nbsp;
# Dependencies
1. [isExpandable](/readme/main/isExpandable.md)

&nbsp;
# How it works
`findExpandableChild` recursively searches a node subtree for the first child that reports expandable/collapsible actions. It checks the current node and then descends through child nodes until it finds a match.

&nbsp;
# How to use

**Find expandable child from a section header:**
```java
expandableNode = findExpandableChild(sectionHeader);
```

&nbsp;
**Use result before collapsing:**
```java
if (expandableNode != null) {
  expandableNode.performAction(AccessibilityNodeInfo.ACTION_COLLAPSE);
}
```

&nbsp;
## Return Value
Returns the first expandable `AccessibilityNodeInfo` found, or `null` if none exists.
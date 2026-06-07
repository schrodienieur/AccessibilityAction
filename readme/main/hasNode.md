# [hasNode](/code/main/hasNode.bsh)

Check whether a node or node collection contains a valid accessibility node.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`hasNode` verifies that the provided `ArrayList`, `HashMap`, or keyed map entry contains at least one valid `AccessibilityNodeInfo` object.

&nbsp;
# How to use

**Check a list of nodes:**
```java
if (hasNode(nodes)) {
  // safe to use the list
}
```

&nbsp;
**Check a node map by key:**
```java
if (hasNode(nodesMap, "submit")) {
  // key exists and contains a node
}
```

&nbsp;
## Return Value
Returns `true` if a valid node is found, otherwise `false`.
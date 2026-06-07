# [toNode](/code/main/toNode.bsh)

Convert node collections or maps into a single node.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`toNode` extracts a single `AccessibilityNodeInfo` from an `ArrayList` or `HashMap`. It supports selecting by index, returning the first element by default, and can look up a node by map key.

&nbsp;
# How to use

**Get the first node from a list:**
```java
node = toNode(nodes);
```

&nbsp;
**Get the last node using index -1:**
```java
node = toNode(nodes, -1);
```

&nbsp;
**Get a node from a map by key:**
```java
node = toNode(nodesMap, "submit");
```

&nbsp;
## Return Value
Returns the selected `AccessibilityNodeInfo` or `null` if the collection is empty or invalid.
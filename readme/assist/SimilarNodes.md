# [SimilarNodes](/code/assist/SimilarNodes.bsh)

Visualize and highlight nodes similar to a selected node, including parent/child relationships.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`SimilarNodes` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `highlight, remove`.

# How to use

```java
similar = SimilarNodes(rootNode, nodeBoxesMap, nodeBox);
```

```java
similar.highlight(targetNode);
```

## Return Value
Returns a scripted SimilarNodes object.

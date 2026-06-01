# [getNodeDistance](/code/main/getNodeDistance.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Calculate the straight-line distance between two nodes.

&nbsp;
# How it works
`getNodeDistance` retrieves the center coordinates of both nodes and calculates the Euclidean distance between them. Returns a large number (99999.0) if either node has invalid coordinates.

&nbsp;
# How to use

**Calculate distance between two nodes:**
```
distance = getNodeDistance(nodeA, nodeB);
```

&nbsp;
## Return Value
Returns the Euclidean distance as a `double` value, or `99999.0` if coordinates are invalid.

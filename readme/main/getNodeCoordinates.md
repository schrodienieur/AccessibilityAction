# [getNodeCoordinates](/code/main/getNodeCoordinates.bsh)

Return the center coordinates of a node using an object result.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getNodeCoordinates` reads a node's bounds and calculates the center pixel coordinates, storing them in a result object.

&nbsp;
# How to use

**Get node coordinates:**
```
result = getNodeCoordinates(node);
```

&nbsp;
**Use the returned coordinates:**
```
tap(result.x, result.y);
```

&nbsp;
## Return Value
Returns an object containing `x` and `y` coordinates, or `null` if the node is invalid.
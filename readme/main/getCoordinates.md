# [getCoordinates](/code/main/getCoordinates.bsh)

Get the screen center point of a node.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getCoordinates` reads a node's bounds in screen coordinates and returns the center point as an Android `Point` object.

&nbsp;
# How to use

**Get center coordinates for a node:**
```
point = getCoordinates(node);
```

&nbsp;
**Use the point for gestures:**
```
tap(point.x, point.y);
```

&nbsp;
## Return Value
Returns a `Point` object with `x` and `y` center coordinates, or `null` if the node is invalid.
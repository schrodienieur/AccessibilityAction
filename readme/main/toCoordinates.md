# [toCoordinates](/code/main/toCoordinates.bsh)

Convert a node to center coordinates.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`toCoordinates` calculates the center pixel coordinates of a node's screen bounds and stores them in a reusable result object.

&nbsp;
# How to use

**Translate a node into coordinates:**
```
coords = toCoordinates(node);
```

&nbsp;
**Use for gestures or taps:**
```
tap(coords.x, coords.y);
```

&nbsp;
## Return Value
Returns an object containing `x` and `y` center coordinates, or `null` if the node is invalid.
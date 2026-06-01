# [isNearby](/code/main/isNearby.bsh)

Check whether a matching node exists near a reference node.

&nbsp;
# Dependencies
1. [findNearbyNodes](/readme/main/findNearbyNodes.md)

&nbsp;
# How it works
`isNearby` uses `findNearbyNodes` to determine whether at least one node matching the selector is within the search radius around the source node.

&nbsp;
# How to use

**Check if a nearby text label exists:**
```
if (isNearby(node, 0, "text", "Price")) {
  // a nearby match exists
}
```

&nbsp;
## Return Value
Returns `true` if a matching node is found nearby, otherwise `false`.
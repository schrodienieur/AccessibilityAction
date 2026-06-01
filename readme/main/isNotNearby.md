# [isNotNearby](/code/main/isNotNearby.bsh)

Check whether no matching node exists near a reference node.

&nbsp;
# Dependencies
1. [findNearbyNodes](/readme/main/findNearbyNodes.md)
2. [isNearby](/readme/main/isNearby.md)

&nbsp;
# How it works
`isNotNearby` returns the inverse of `isNearby`, confirming that no matching node appears within the searched area.

&nbsp;
# How to use

**Confirm absence of a nearby label:**
```
if (isNotNearby(node, "text", "Price")) {
  // no nearby match found
}
```

&nbsp;
## Return Value
Returns `true` when no nearby matching node exists, otherwise `false`.
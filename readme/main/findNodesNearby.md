# [findNodesNearby](/code/main/findNodesNearby.bsh)

Filter a node list by proximity rules.

&nbsp;
# Dependencies
1. [findNearbyNodes](/readme/main/findNearbyNodes.md)
2. [getDistance](/readme/main/getDistance.md)

&nbsp;
# How it works
`findNodesNearby` evaluates candidate nodes against a sequence of proximity configs, keeping only nodes that satisfy nearby or not-nearby conditions. It sorts matches by the distance to the nearest successful sibling.

&nbsp;
# How to use

**Filter nodes by nearby match:**
```java
results = findNodesNearby(foundNodes, new Object[][] {
  {0, "text", "Label"}
});
```

&nbsp;
**Exclude nodes near a sibling:**
```java
results = findNodesNearby(foundNodes, new Object[][] {
  {"No", false}
});
```

&nbsp;
## Return Value
Returns an `ArrayList` of nodes that match the proximity configuration, sorted closest-first.
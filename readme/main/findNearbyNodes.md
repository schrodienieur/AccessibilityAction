# [findNearbyNodes](/code/main/findNearbyNodes.bsh)

Find nodes near a reference node and sort them by distance.

&nbsp;
# Dependencies
1. [findNodes](/readme/main/findNodes.md)
2. [getDistance](/readme/main/getDistance.md)

&nbsp;
# How it works
`findNearbyNodes` climbs a specified number of parent levels, then searches for matching nodes by key/value. It calculates screen distance from the source node and returns results ordered by proximity.

&nbsp;
# How to use

**Find nodes near a source node:**
```java
nearby = findNearbyNodes(sourceNode, 0, "text", "Price");
```

&nbsp;
**Use a parent-level search radius:**
```java
nearby = findNearbyNodes(sourceNode, 1, identifierKey, "com.example:id/label");
```

&nbsp;
## Return Value
Returns an `ArrayList` of matching nodes sorted from nearest to farthest.
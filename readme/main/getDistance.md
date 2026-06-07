# [getDistance](/code/main/getDistance.bsh)

Calculate the screen distance between two nodes.

&nbsp;
# Dependencies
1. [getCoordinates](/readme/main/getCoordinates.md)

&nbsp;
# How it works
`getDistance` computes the Euclidean distance between the center points of two nodes using `getCoordinates`.

&nbsp;
# How to use

**Measure distance between two nodes:**
```java
distance = getDistance(node1, node2);
```

&nbsp;
**Compare distances:**
```java
if (getDistance(node1, node2) < 100) {
  // nodes are close
}
```

&nbsp;
## Return Value
Returns a numeric distance value, or a large sentinel value if one of the nodes is invalid.
# [getAllNodes](/code/main/getAllNodes.bsh)

Retrieve all nodes from the active window.

&nbsp;
# Dependencies
1. [getService](/readme/main/getService.md)
2. [toNode](/readme/main/toNode.md)

&nbsp;
# How it works
`getAllNodes` uses the accessibility service to recursively collect all nodes from the active root or from a specified node. It supports direct node inputs, lists, and maps.

&nbsp;
# How to use

**Get all nodes from the active window:**
```
allNodes = getAllNodes();
```

&nbsp;
**Get all nodes under a specific subtree:**
```
childNodes = getAllNodes(parentNode);
```

&nbsp;
## Return Value
Returns an `ArrayList` of nodes, or an empty list if the service/root is unavailable.
# [getNode](/code/main/getNode.bsh)

Resolve a single matching node from the accessibility tree.

&nbsp;
# Dependencies
1. [findNodes](/readme/main/findNodes.md)
2. [getRoot](/readme/main/getRoot.md)
3. [toNode](/readme/main/toNode.md)
4. [waitNodes](/readme/main/waitNodes.md)

&nbsp;
# How it works
`getNode` is the primary node lookup helper. It uses `findNodes` and `waitNodes` to discover nodes by text, id, regex, focus, and proximity rules, then returns the selected node by index.

&nbsp;
# How it use

**Find the first node by text:**
```
node = getNode("Login");
```

&nbsp;
**Find by resource id:**
```
node = getNode(identifierKey, "com.example:id/button");
```

&nbsp;
**Find a sibling-related node:**
```
node = getNode("text", "Submit", 0, waitNodesTimeout, 1, "text", "Password");
```

&nbsp;
## Return Value
Returns a single `AccessibilityNodeInfo` or `null` if no matching node is found.
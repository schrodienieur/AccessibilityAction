# [waitNodes](/code/main/waitNodes.bsh)

Wait for nodes to appear on screen.

&nbsp;
# Dependencies
1. [findNodes](/readme/main/findNodes.md)
2. [getRoot](/readme/main/getRoot.md)

&nbsp;
# How it works
`waitNodes` listens for accessibility events until matching nodes are found or a timeout expires. It supports bulk results keyed by IDs and standard search overloads for single selectors.

&nbsp;
# How to use

**Wait for a node by text:**
```
result = waitNodes("text", "Login", 5000);
```

&nbsp;
**Wait for multiple IDs:**
```
config = new Object[][] {
  {"button", "text", "OK"},
  {"input", "id", "com.example:id/edit"}
};
map = waitNodes(config, 5000, true);
```

&nbsp;
## Return Value
Returns a `HashMap` of found nodes for bulk search, or an `ArrayList` of nodes for individual selector overloads.
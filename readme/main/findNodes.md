# [findNodes](/code/main/findNodes.bsh)

Find nodes using text, id, regex, focus, and proximity filters.

&nbsp;
# Dependencies
1. [findNodesNearby](/readme/main/findNodesNearby.md)
2. [findNodesRecursive](/readme/main/findNodesRecursive.md)
3. [findSpannedNodes](/readme/main/findSpannedNodes.md)
4. [getRoot](/readme/main/getRoot.md)
5. [getText](/readme/main/getText.md)

&nbsp;
# How it works
`findNodes` is a flexible multi-purpose search helper. It supports direct root searches, text and ID selectors, regex matching, spanned text searches, focused node lookup, proximity filters, and bulk ID-mapped searches.

&nbsp;
# How to use

**Find nodes by text:**
```java
buttons = findNodes("Save");
```

&nbsp;
**Find nodes by id:**
```java
nodes = findNodes("id", "com.example:id/button");
```

&nbsp;
**Find nodes with nearby criteria:**
```java
nodes = findNodes("text", "Submit", 1, "text", "Login");
```

&nbsp;
**Bulk search with IDs:**
```java
config = new Object[][] {
  {"btn1", "text", "OK"},
  {"input", "id", "com.example:id/input"}
};
map = findNodes(config, true);
```

&nbsp;
## Return Value
Returns an `ArrayList` of matching nodes or a `HashMap` when using bulk ID-mapped search.
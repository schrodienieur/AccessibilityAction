# [findNodesRecursive](/code/main/findNodesRecursive.bsh)

Recursively search the accessibility tree for matching nodes.

&nbsp;
# Dependencies
1. [getRoot](/readme/main/getRoot.md)
2. [getText](/readme/main/getText.md)

&nbsp;
# How it works
`findNodesRecursive` walks the node tree manually with a stack and matches nodes by id, class, text, regex, or focus. It is a robust fallback when system search is unreliable.

&nbsp;
# How to use

**Find nodes by text recursively:**
```java
results = findNodesRecursive(getRoot(), "text", "Save");
```

&nbsp;
**Find nodes by regex:**
```java
results = findNodesRecursive(getRoot(), "regex", "^Item\\s\\d$");
```

&nbsp;
## Return Value
Returns an `ArrayList` of matching nodes, or an empty list if none are found.
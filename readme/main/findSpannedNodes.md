# [findSpannedNodes](/code/main/findSpannedNodes.bsh)

Search for nodes containing spanned text or metadata.

&nbsp;
# Dependencies
1. [getText](/readme/main/getText.md)

&nbsp;
# How it works
`findSpannedNodes` traverses the node tree and extracts text from normal text fields and spanned metadata such as `URLSpan` or `LocaleSpan`. It can match exact strings or regex patterns.

&nbsp;
# How to use

**Find nodes by custom text span:**
```java
results = findSpannedNodes(getRoot(), "TextSpan", "Submit");
```

&nbsp;
**Find nodes by regex:**
```java
results = findSpannedNodes(getRoot(), "/r/https?://.*", "/r/https?://.*");
```

&nbsp;
## Return Value
Returns an `ArrayList` of nodes that contain the requested spanned or metadata text.
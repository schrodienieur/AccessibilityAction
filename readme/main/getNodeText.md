# [getNodeText](/code/main/getNodeText.bsh)

Extract smart text from a node, including spans and metadata.

&nbsp;
# Dependencies
1. [getText](/readme/main/getText.md)
2. [toNode](/readme/main/toNode.md)

&nbsp;
# How it works
`getNodeText` tries raw text, content description, and spanned metadata in a waterfall fashion. It can extract plain text, span values such as URLs, and locale metadata.

&nbsp;
# How to use

**Get visible text from a node:**
```
text = getNodeText(node);
```

&nbsp;
**Get a specific span value:**
```
url = getNodeText(node, "URLSpan");
```

&nbsp;
## Return Value
Returns the extracted string, or `null`/empty string if unavailable.
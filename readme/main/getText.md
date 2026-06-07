# [getText](/code/main/getText.bsh)

Extract smart text from a node using a waterfall strategy.

&nbsp;
# Dependencies
1. [toNode](/readme/main/toNode.md)

&nbsp;
# How it works
`getText` checks raw text, content description, and spanned metadata. It can return plain text, URL spans, locale spans, or seek bar values.

&nbsp;
# How to use

**Get text from a node:**
```java
value = getText(node);
```

&nbsp;
**Get a specific metadata span:**
```java
link = getText(node, "URLSpan");
```

&nbsp;
## Return Value
Returns a string or appropriate metadata value extracted from the node.
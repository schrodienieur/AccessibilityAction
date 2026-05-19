# [waitUntilGone](/code/main/waitUntilGone.bsh)

Wait until specified nodes disappear from the screen.

&nbsp;
# Dependencies
1. [findNodes](/readme/main/findNodes.md)
2. [getRoot](/readme/main/getRoot.md)
3. [waitNodes](/readme/main/waitNodes.md)

&nbsp;
# How it works
`waitUntilGone` monitors accessibility events until matching nodes are no longer present. It supports waiting for all targets to disappear or just any one of them.

&nbsp;
# How it use

**Wait until a button disappears:**
```
waitUntilGone("text", "Loading", 5000);
```

&nbsp;
**Wait until multiple targets disappear:**
```
config = new Object[][] {
  {"spinner", "text", "Loading"},
  {"dialog", identifierKey, "com.example:id/dialog"}
};
waitUntilGone(config, 5000, true);
```

&nbsp;
## Return Value
Returns `true` when the disappearance condition is met, or `false`/throws on timeout depending on configuration.
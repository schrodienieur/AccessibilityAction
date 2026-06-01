# [getContext](/code/main/getContext.bsh)

Get the context for a display or overlay.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getContext` returns either the standard app context or the accessibility overlay context. It also adapts the returned context to the specified display ID when available.

&nbsp;
# How to use

**Get the default context:**
```
ctx = getContext();
```

&nbsp;
**Get the accessibility overlay context:**
```
ctx = getContext(true);
```

&nbsp;
## Return Value
Returns an Android `Context` object for the requested overlay or display.
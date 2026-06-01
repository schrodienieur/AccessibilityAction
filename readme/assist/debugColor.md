# [debugColor](/code/assist/debugColor.bsh)

Utility for debug color handling, including alpha adjustment and named color lookups.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`debugColor` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `setAlpha, debugColor`.

# How to use

```
color = debugColor("default");
```

```
color = setAlpha(color, 128);
```

## Return Value
Returns a color value or color metadata object.

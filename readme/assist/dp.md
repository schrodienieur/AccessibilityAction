# [dp](/code/assist/dp.bsh)

Convert density-independent pixels (dp) into actual screen pixels based on display density.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`dp` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `dp`.

# How to use

```
pixels = dp(16);
```

## Return Value
Returns the converted pixel value as an integer.

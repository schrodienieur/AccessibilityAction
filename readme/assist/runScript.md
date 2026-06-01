# [runScript](/code/assist/runScript.bsh)

Execute a BeanShell script in the a11Y context on a background thread, with optional delay and event muting.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`runScript` is a helper function or object from the assist folder that provides execute a beanshell script in the a11y context on a background thread, with optional delay and event muting.
It exposes methods such as `runScript`.

# How to use

```
runScript("log("Hello");", 100);
```

## Return Value
Returns void. The provided script is executed asynchronously.

# [ThisManager](/code/lib/ThisManager.bsh)

Inspect BeanShell `This` objects and expose metadata about variables and methods.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`ThisManager` is a helper function or object from the lib folder that provides inspect beanshell `this` objects and expose metadata about variables and methods.
It exposes methods such as `toArray`.

# How to use

```
manager = ThisManager(This);
```

```
manager.toArray(objs);
```

## Return Value
Returns a scripted ThisManager helper object.

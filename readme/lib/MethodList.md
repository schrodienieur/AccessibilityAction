# [MethodList](/code/lib/MethodList.bsh)

Manage and format a list of method names, including capitalized display labels for UI selection.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`MethodList` is a helper function or object from the lib folder that provides manage and format a list of method names, including capitalized display labels for ui selection.
It exposes methods such as `getCapitalized, getOriginal, convertToCapital, convertToOriginal, get`.

# How to use

```java
ml = MethodList(methods);
```

```java
caps = ml.getCapitalized();
```

## Return Value
Returns a scripted MethodList object.

# [NodeInfo](/code/assist/NodeInfo.bsh)

Accessibility node metadata helper for node constants, group names, and property inspection.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`NodeInfo` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `getConstantNames, getConstant, getGroupList, getGroupNames`.

# How to use

```
info = NodeInfo(node);
```

```
constants = info.getConstantNames();
```

## Return Value
Returns a scripted NodeInfo object.

# [clearFocus](/code/actions/clearFocus.bsh)

Clear focus from any currently focused input node.

&nbsp;
# Dependencies
1. [findRelevantNodesForClear](/readme/actions/findRelevantNodesForClear.md)
2. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`clearFocus` scans for nodes that currently hold focus and performs `ACTION_CLEAR_FOCUS` on them. It is typically used to dismiss keyboards or move focus away from input fields.

&nbsp;
# How to use

**Clear current focus:**
```java
clearFocus();
```

&nbsp;
## Return Value
Returns a status marker when the operation completes, or an empty result if no focus nodes were found.
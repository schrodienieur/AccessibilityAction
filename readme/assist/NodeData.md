# [NodeData](/code/assist/NodeData.bsh)

Extract structured properties from an AccessibilityNodeInfo object, including bounds, text, and action flags.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`NodeData` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `NodeData`.

# How to use

```
data = NodeData(node);
```

## Return Value
Returns a scripted NodeData object containing node metadata.

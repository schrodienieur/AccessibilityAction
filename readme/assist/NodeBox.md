# [NodeBox](/code/assist/NodeBox.bsh)

Node box overlay that wraps accessibility nodes and exposes node detail, gesture, and info controls.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`NodeBox` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, remove, infoDialog, simpleGesture`.

# How to use

```
box = NodeBox(context, overlayType, node);
```

```
box.show();
```

## Return Value
Returns a scripted NodeBox object.

# [StructureOverlay](/code/assist/StructureOverlay.bsh)

Overlay for displaying accessibility node structure and managing node box history/highlighting.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`StructureOverlay` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `hideBox, addHistory, remove`.

# How to use

```
overlay = StructureOverlay(listener, root, true, 0);
```

```
overlay.hideBox(nodeBox);
```

## Return Value
Returns a scripted StructureOverlay object.

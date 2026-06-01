# [InfoDialog](/code/assist/InfoDialog.bsh)

Dialog overlay that displays node metadata and property chips for detailed node inspection.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`InfoDialog` is a helper function or object from the assist folder that provides dialog overlay that displays node metadata and property chips for detailed node inspection.
It exposes methods such as `createPropertyChip, getNodeData`.

# How to use

```
dialog = InfoDialog(node);
```

```
dialog.show();
```

## Return Value
Returns a scripted InfoDialog object.

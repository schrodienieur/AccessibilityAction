# [ActionPicker](/code/assist/ActionPicker.bsh)

Interactive action picker for a node. Prompts users to choose an action or pattern based on inspected node data and available methods.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`ActionPicker` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `selectActions, selectPattern`.

# How to use

```
picker = ActionPicker(nodeData);
```

```
action = picker.selectActions(inspector, true);
```

## Return Value
Returns a scripted ActionPicker object.

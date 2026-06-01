# [ViewControl](/code/lib/ViewControl.bsh)

Manage overlay views for the assist system, including add/remove and visibility checks.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`ViewControl` is a helper function or object from the lib folder that provides manage overlay views for the assist system, including add/remove and visibility checks.
It exposes methods such as `addView, removeView, getView, isHidden, isVisible, isRemoved`.

# How to use

```
vc = ViewControl();
```

```
vc.addView(viewObject);
```

## Return Value
Returns a scripted ViewControl manager object.

# [DisplayMenu](/code/assist/DisplayMenu.bsh)

Display selection overlay used to pick and manage available displays in the assist UI.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`DisplayMenu` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, remove, toggle`.

# How to use

```
menu = DisplayMenu();
```

```
menu.toggle();
```

## Return Value
Returns a scripted DisplayMenu object.

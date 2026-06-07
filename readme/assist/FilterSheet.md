# [FilterSheet](/code/assist/FilterSheet.bsh)

Filter sheet overlay for node groups and flags. Lets users build dynamic node filters with material chips.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`FilterSheet` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `config, addFlag, removeFlag, getViewList`.

# How to use

```java
sheet = FilterSheet(structure);
```

```java
sheet.show();
```

## Return Value
Returns a scripted FilterSheet object.

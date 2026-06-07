# [NodeSearch](/code/assist/NodeSearch.bsh)

Node search overlay for locating nodes inside a structure overlay and selecting nodes from a list.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`NodeSearch` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, remove, toggle, loadList`.

# How to use

```java
search = NodeSearch(structureOverlay);
```

```java
search.show();
```

## Return Value
Returns a scripted NodeSearch object.

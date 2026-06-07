# [showOnScreen](/code/actions/showOnScreen.bsh)

Bring a node into view on screen.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`showOnScreen` performs the `ACTION_SHOW_ON_SCREEN` action on a node and refreshes it. It is useful for ensuring a target node is visible before interacting with it.

&nbsp;
# How to use

**Show a node on screen:**
```java
showOnScreen(node);
```

&nbsp;
## Return Value
This helper does not return a value; it updates the node visibility state directly.
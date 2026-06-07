# [debugMe](/code/assist/debugMe.bsh)

Node debugging helper that visualizes accessibility nodes with overlays and interactive node boxes.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`debugMe` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `debugMe, line`.

# How to use

```java
debugMe(nodes);
```

## Return Value
Returns the debug overlay object or visualizer state.

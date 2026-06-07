# [imeEnter](/code/actions/imeEnter.bsh)

Send an IME Enter action to a target node.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [toNode](/readme/main/toNode.md)
5. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`imeEnter` performs the IME Enter action on a target node, typically used to submit input from a keyboard-aware field. It can act on a direct node, selector, or the currently focused element.

&nbsp;
# How to use

**Send IME Enter to a field by id:**
```java
imeEnter(identifierKey, "com.example:id/message_input", 0);
```

&nbsp;
**Send IME Enter to the focused node:**
```java
imeEnter();
```

&nbsp;
## Return Value
Returns the `AccessibilityNodeInfo` that received the IME Enter action, or `null` if the node was not found.
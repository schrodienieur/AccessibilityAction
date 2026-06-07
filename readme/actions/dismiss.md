# [dismiss](/code/actions/dismiss.bsh)

Dismiss a dismissible UI element such as a dialog or notification.

&nbsp;
# Dependencies
1. [getNode](/readme/main/getNode.md)
2. [getRoot](/readme/main/getRoot.md)
3. [toNode](/readme/main/toNode.md)
4. [wait](/readme/main/wait.md)

&nbsp;
# How it works
`dismiss` finds a node and performs `ACTION_DISMISS`. It supports node objects, collections, maps, and selector-based search, plus root-relative variants.

&nbsp;
# How to use

**Dismiss by text:**
```java
dismiss("New Update Available");
```

&nbsp;
**Dismiss by resource id:**
```java
dismiss(identifierKey, "com.example:id/close_button");
```

&nbsp;
**Dismiss a node directly:**
```java
dismiss(node);
```

&nbsp;
## Return Value
Returns the dismissed `AccessibilityNodeInfo`, or `null` if no matching node was found.
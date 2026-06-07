# [InfoToast](/code/assist/InfoToast.bsh)

Toast-style overlay for node information, allowing rows to be added, updated, or cleared dynamically.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`InfoToast` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, remove, addRow, updateRow, removeRow, clearRows`.

# How to use

```java
toast = InfoToast(node, context, overlayType);
```

```java
toast.show();
```

## Return Value
Returns a scripted InfoToast overlay object.

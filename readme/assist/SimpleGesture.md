# [SimpleGesture](/code/assist/SimpleGesture.bsh)

Attach a simple gesture listener to a Android view and route gesture events to a scripted listener object.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`SimpleGesture` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `listen, remove, mute, unmute`.

# How to use

```
gesture = SimpleGesture(view, listener, customObjects);
```

```
gesture.remove();
```

## Return Value
Returns a scripted SimpleGesture object.

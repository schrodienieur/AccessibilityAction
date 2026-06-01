# [AssistBar](/code/assist/AssistBar.bsh)

Overlay assist bar that provides quick access to display controls, node search, filtering, scripting, and settings.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`AssistBar` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `displayMenu, scriptEditor, assistSetting`.

# How to use

```
bar = AssistBar(0, 0);
```

```
bar.show();
```

## Return Value
Returns a scripted AssistBar object.

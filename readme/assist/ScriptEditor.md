# [ScriptEditor](/code/assist/ScriptEditor.bsh)

Script editor UI used to edit and execute BeanShell scripts from the assist interface.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`ScriptEditor` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, save, toggle`.

# How to use

```
editor = ScriptEditor();
```

```
editor.show();
```

## Return Value
Returns a scripted ScriptEditor object.

# [AssistSetting](/code/assist/AssistSetting.bsh)

Assist settings manager. Creates a settings overlay with options for assistive behavior and persistence.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`AssistSetting` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `save, remove, layout`.

# How to use

```
settings = AssistSetting();
```

```
settings.save();
```

## Return Value
Returns a scripted AssistSetting object.

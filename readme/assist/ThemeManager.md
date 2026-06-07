# [ThemeManager](/code/assist/ThemeManager.bsh)

Theme manager for assist UI overlays, providing Material theming and context wrapper support.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`ThemeManager` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `setWrapperContext, setTheme, setThemeDark, setThemeLight`.

# How to use

```java
theme = ThemeManager(context);
```

```java
theme.setTheme("Material3");
```

## Return Value
Returns a scripted ThemeManager object.

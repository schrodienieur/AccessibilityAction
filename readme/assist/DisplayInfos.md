# [DisplayInfos](/code/assist/DisplayInfos.bsh)

Display information overlay that shows display name and numeric ID, with copy-to-clipboard support.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`DisplayInfos` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `show, remove`.

# How to use

```
infos = DisplayInfos();
```

```
infos.show();
```

## Return Value
Returns a scripted DisplayInfos overlay object.

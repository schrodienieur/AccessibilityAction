# [isMatch](/code/main/isMatch.bsh)

Match a node against a search key, value, or pattern.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`isMatch` evaluates whether an `AccessibilityNodeInfo` matches a specified criterion such as `id`, `class`, `text`, `regex`, `focus`, or `flags`. It also supports BeanShell `This` namespace objects for compound matching across multiple fields.

&nbsp;
# How to use

**Match by text:**
```
matched = isMatch(node, "text", "Login");
```

&nbsp;
**Match by regex pattern:**
```
matched = isMatch(node, Pattern.compile("submit.*"));
```

&nbsp;
**Match by resource id:**
```
matched = isMatch(node, "id", "com.example:id/button");
```

&nbsp;
## Return Value
Returns `true` if the node matches the given criteria, otherwise `false`.

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
```java
matched = isMatch(node, "text", "Login");
```

&nbsp;
**Match by regex pattern:**
```java
matched = isMatch(node, Pattern.compile("submit.*"));
```

&nbsp;
**Match by resource id:**
```java
matched = isMatch(node, "id", "com.example:id/button");
```

&nbsp;
## Return Value
Returns `true` if the node matches the given criteria, otherwise `false`.

## Multi-key (BeanShell `This`) matching

`isMatch` supports a BeanShell `This` object to define multiple matching criteria at once. This is useful when you need to require several fields simultaneously or express negative matches.

Supported variable names inside the `This` object:

- `id` — resource id string
- `text` — text to match (case-insensitive, partial match)
- `class` / `clazz` — node class name
- `regex` — a regex pattern string (will be compiled to `java.util.regex.Pattern`)
- `flags` — integer flags (string values are parsed)
- `focus` — boolean check for focus

Negation: prefix a variable with `no` to invert the match for that field. For example `noid` or `notext` will make the matcher ensure the node does NOT match that value.

Behavior notes:

- `text` values are converted to lowercase and matched case-insensitively as substring containment unless you use strict key variants.
- `regex` values provided as strings are compiled with `Pattern.compile()` before matching.
- If any non-negated criterion fails the overall match returns `false` immediately.
- If a negated criterion (`no*`) matches, the overall match returns `false` immediately.
- At least one criterion must be present in the `This` object for the matcher to return `true`.

Example usage:

```java
This keys = This();
keys.text = "login";
keys.id = "com.example:id/login_button";
// ensure the node is not focused
keys.nofocus = true;

boolean matched = isMatch(node, keys);
```

Example with regex and flags:

```java
This keys = This();
keys.regex = "submit.*"; // compiled internally
keys.flags = "4"; // parsed to int
boolean matched = isMatch(node, keys);
```

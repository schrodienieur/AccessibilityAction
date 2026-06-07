# [getClipboard](/code/others/getClipboard.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Retrieve text from the system clipboard with hybrid access methods.

&nbsp;
# How it works
`getClipboard` attempts to retrieve clipboard content using two methods:
1. **Primary (Shizuku)**: Privileged access for unrestricted clipboard read
2. **Fallback (Overlay)**: Accessibility-based approach with a 5-second timeout

&nbsp;
# How to use

**Get clipboard content:**
```java
text = getClipboard();
```

&nbsp;
## Return Value
Returns the clipboard text as a `String`, or `null` if the clipboard is empty.

&nbsp;
## Exceptions
Throws `JavaCodeException` if the fallback overlay method times out after 5 seconds.

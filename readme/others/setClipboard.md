# [setClipboard](/code/others/setClipboard.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Copy text to the system clipboard.

&nbsp;
# How it works
`setClipboard` retrieves the system ClipboardManager service and sets the primary clip using `ClipData`. If the text is null, the function returns without performing any action.

&nbsp;
# How to use

**Copy text to clipboard:**
```
setClipboard("Hello from Tasker!");
```

&nbsp;
## Return Value
None. Text is copied asynchronously.

&nbsp;
## Exceptions
Throws `JavaCodeException` if the ClipboardManager service cannot be obtained.

# [shareText](/code/others/shareText.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Share text to a specific app or system chooser.

&nbsp;
# How it works
`shareText` creates an `ACTION_SEND` intent with text/plain type. If a package name is provided, the intent targets that specific app; otherwise, it uses the system share chooser.

&nbsp;
# How to use

**Share to specific app (e.g., WhatsApp):**
```java
shareText("Check this out!", "com.whatsapp");
```

&nbsp;
**Open system share chooser:**
```java
shareText("Check this out!", null);
```

&nbsp;
## Return Value
None. Intent is launched asynchronously.

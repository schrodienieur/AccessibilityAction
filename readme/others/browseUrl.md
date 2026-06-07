# [browseUrl](/code/others/browseUrl.bsh)

&nbsp;
# Dependencies
None

&nbsp;
Opens a URL or deep link with optional package targeting.

&nbsp;
# How it works
`browseUrl` creates a VIEW intent. If a package name is provided, the intent is forced to open in that specific app; otherwise, it uses the system's default handler.

&nbsp;
# How to use

**Open URL with default handler:**
```java
browseUrl("https://example.com");
```

&nbsp;
**Open URL in specific app:**
```java
browseUrl("https://example.com", "com.android.chrome");
```

&nbsp;
**Open deep link:**
```java
browseUrl("myapp://action/details?id=123");
```

&nbsp;
## Return Value
None. Intent is launched asynchronously.

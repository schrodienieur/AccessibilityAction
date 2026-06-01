# [UpdateManager](/code/lib/UpdateManager.bsh)

Utilities for update workflows, including opening URLs, making HTTP requests, and unpacking zip files.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`UpdateManager` is a helper function or object from the lib folder that provides utilities for update workflows, including opening urls, making http requests, and unpacking zip files.
It exposes methods such as `browseUrl, makeRequest, unzipFile`.

# How to use

```
updater = UpdateManager();
```

```
updater.browseUrl(url);
```

## Return Value
Returns a scripted UpdateManager object.

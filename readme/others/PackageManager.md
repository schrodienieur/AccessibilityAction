# [PackageManager](/code/others/PackageManager.bsh)

Core package resolver for finding applications by label or package name.

&nbsp;
# How it works
`PackageManager` initializes a helper object that maintains a cache of installed applications and their label-to-package mappings. It provides methods to resolve package names from labels and launch application intents.

&nbsp;
# How to use

**Initialize PackageManager:**
```
pm = PackageManager();
```

&nbsp;
**Resolve package by label:**
```
pkg = pm.resolvePackage("WhatsApp");
```

&nbsp;
**Resolve package by package name:**
```
pkg = pm.resolvePackage("com.whatsapp");
```

&nbsp;
**Build cache of installed apps:**
```
pm.buildCache();
```

&nbsp;
## Return Value
Returns package name as a `String`, or `null` if the application is not found or is disabled.

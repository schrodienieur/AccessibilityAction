
# a11Y

a11Y is a global Java variable initialized by [`a11Y.java`](/code/a11Y.java). Once it is created, it can be used across any Java Code action in Tasker.

It exposes helper variables and methods for loading imports, managing UI assist helpers, controlling debug behavior, and executing scripts.

## 1. Usage Comparison
### without a11Y
```java
// use import.java
source("full import path");
click("Add");

// or include everything inside import.java

addClassPath("/storage/emulated/0/Folder");
importCommands("main"); // Must
importCommands("actions");
click("Add");

// or include every code and its dependencies / other code it uses

getRoot() {}
findNodes(String text) {
    //
}
openApp(String appName) {
    //
}
click(String key, String value) {
    //
}

click("text", "Add");
```

This must be done in every Java Code action if you want to reuse the same helpers.

### with a11Y
```java
a11Y.set();
click("Add");
```

&nbsp;

## 2. Variables

### 2.1 Environment

| Variable            | Type                 | Description                                                                                           | Default Value     |
| :------------------ | :------------------- | :---------------------------------------------------------------------------------------------------- | :---------------- |
| `ENV_PATH`          | `String`             | Path to the AccessibilityAction environment folder.                                                   | `null`            |
| `LOG_FILE`          | `String`             | Log file path derived from `ENV_PATH`.                                                               | `null`            |
| `ENV`               | `This`               | [`Environment`](/code/main/Environment.bsh) instance loaded by `a11Y.set()`.                         | `null`            |
| `assistOverlays`    | `List`               | Stored overlays from [`StructureOverlay`](/code/assist/StructureOverlay.bsh), [`NodeBox`](/code/assist/NodeBox.bsh), [`InfoToast`](/code/assist/InfoToast.bsh), [`InfoDialog`](/code/assist/InfoDialog.bsh), etc. | `new ArrayList()` |
| `assistBar`         | `This`               | Assist overlay bar instance created by [`AssistBar`](/code/assist/AssistBar.bsh).                    | `null`            |
| `materialColorFallback` | `This`           | Fallback material color helper used when theme colors are not available.                            | `null`            |
| `displayInfos`      | `This`               | Display helper used by `testDisplay()` to show temporary info overlays.                              | `null`            |
| `lastActionPickerReminder` | `long`        | Timestamp of the last action picker reminder.                                                         | `0`               |
| `mainHandler`       | `Handler`            | Main thread handler used for posting UI actions.                                                     | `new Handler(Looper.getMainLooper())` |
| `customThreadFactory` | `ThreadFactory`    | Custom thread factory for executor threads with max priority.                                        | custom factory    |
| `config`            | `This`               | Configuration object loaded from `ENV_PATH + "/config.java"`.                                     | `null`            |
| `NodeInfo`          | `This`               | Node metadata helper available to scripts and helpers.                                               | `null`            |
| `a11yController`    | `This`               | Accessibility service controller used to enable or disable the service.                              | `null`            |
| `viewControl`       | `This`               | UI view control helper exposed to scripts and overlay helpers.                                      | `null`            |
| `updateManager`     | `This`               | Update manager created by [`UpdateManager`](/code/lib/UpdateManager.bsh).                             | `null`            |
| `packageManager`    | `This`               | Package manager created by [`PackageManager`](/code/others/PackageManager.bsh).                      | `null`            |
| `scriptEditor`      | `String`             | Script editor content path or identifier.                                                             | `""`            |
| `inspector`         | `This`               | Method inspector created by [`MethodInspector`](/code/lib/MethodInspector.bsh).                      | `null`            |
| `executor`          | `ThreadPoolExecutor` | Single-thread executor used for async tasks and reloads.                                              | 1 thread          |

### 2.2 Debugging & Behavior

| Variable            | Type       | Description                                                                                 | Default Value |
| :------------------ | :--------- | :------------------------------------------------------------------------------------------ | :------------ |
| `debugMe`           | `boolean`  | Enable debug mode.                                                                          | `false`       |
| `debugSteps`        | `boolean`  | Enable debug step tracing.                                                                 | `false`       |
| `debugInfo`         | `boolean`  | Show info toast for interacted nodes.                                                       | `true`        |
| `findDelay`         | `long`     | Highlight duration for found nodes.                                                         | `100`         |
| `debugDelay`        | `long`     | Highlight duration for generic debug actions.                                               | `1000`        |
| `useOffset`         | `boolean`  | Use status bar offset for application overlay display.                                      | `true`        |
| `useA11yOffset`     | `boolean`  | Use status bar offset for accessibility overlay display.                                    | `true`        |
| `waitNodes`         | `boolean`  | Wait for node availability before performing actions.                                       | `true`        |
| `waitNodesTimeout`  | `long`     | Maximum time to wait for nodes before timing out.                                           | `10000`       |
| `useA11yStructure`  | `boolean`  | Use accessibility structure for node finding if available.                                  | `false`       |
| `includeAllMethods` | `boolean`  | Include all methods when picking an action.                                                 | `false`       |
| `quickAddMode`      | `boolean`  | Use quick add mode for long-press boxes instead of opening the copy dialog.                 | `true`        |
| `updatePreRelease`  | `boolean`  | Use pre-release updates during `update()`.                                                   | `false`       |

## 3. Methods / Functions

### Initialization

1. [`set()`](/code/a11Y.java)

   Initialize `a11Y` and load imports from [`import.java`](/code/import.java).
   If `ENV_PATH` is not set, `a11Y.set()` will attempt to load a super import from Tasker's global variable `%ImportJava` and use the `MAIN_DIRECTORY` it provides.

   - If `ENV_PATH` is already set, it sources `ENV_PATH + "/import.java"`.
   - Otherwise it falls back to the shared environment import mechanism.

2. [`set(This THIS)`](/code/a11Y.java)

   Same as `set()`, but applies the current interpreter namespace variables to the provided `THIS` instance.

3. [`setEnvPath(String path)`](/code/a11Y.java)

   Set the environment folder path used by `set()` and script execution.
   This also updates `LOG_FILE = path + "/log.txt"`.

4. [`setEnv(This env)`](/code/a11Y.java)

   Set the loaded [`Environment()`](/code/main/Environment.bsh) object directly.

5. [`resetEnv()`](/code/a11Y.java)

   Clear `ENV_PATH` so `set()` will fall back to `%ImportJava` and the shared import path.

6. [`reset()`](/code/a11Y.java)

   Restore default runtime flags:
   ```java
   debugSteps = false;
   debugMe = false;
   debugInfo = true;
   findDelay = 100;
   debugDelay = 1000;
   useOffset = true;
   useA11yOffset = true;
   waitNodes = true;
   useA11yStructure = false;
   includeAllMethods = false;
   quickAddMode = true;
   waitNodesTimeout = 10000;
   ```

7. [`debug()`](/code/a11Y.java)

   Enable `debugMe = true` for the current runtime.

8. [`reload()`](/code/a11Y.java)

   Reload the current [`a11Y.java`](/code/a11Y.java) source asynchronously using the configured `ENV_PATH`.

9. [`testDisplay()`](/code/a11Y.java)

   Initialize and show the `displayInfos` helper overlay for a short duration. Useful to verify display helper behavior during development.

10. [`post(Runnable run)`](/code/a11Y.java)

   Post a `Runnable` to the main UI thread using `mainHandler`.

### Overlay management

1. [`addOverlay(This overlay)`](/code/a11Y.java)

   Track overlay instances created by helpers such as [`StructureOverlay`](/code/assist/StructureOverlay.bsh), [`NodeBox`](/code/assist/NodeBox.bsh), [`InfoToast`](/code/assist/InfoToast.bsh), and [`InfoDialog`](/code/assist/InfoDialog.bsh).

2. [`removeOverlay(This overlay)`](/code/a11Y.java)

   Remove a stored overlay from the internal list.

3. [`clean()`](/code/a11Y.java)

   Remove and clear all tracked overlay instances.

4. [`showAssist()`](/code/a11Y.java)

   Show the assist overlay bar created by [`AssistBar`](/code/assist/AssistBar.bsh).

5. [`removeAssist()`](/code/a11Y.java)

   Remove the assist bar overlay.

6. [`remove(boolean clearA11Y)`](/code/a11Y.java)

   Remove `a11Y` state, clean overlays, remove assist UI, stop event listeners, and shut down the executor. If `clearA11Y` is `true`, the global Tasker variable `a11Y` is also cleared.

7. [`remove()`](/code/a11Y.java)

   Alias for `remove(true)` that fully removes the global `a11Y` instance.

### Events

Event helpers delegate to the global [`a11E`](/code/event/a11E.bsh) instance stored in Tasker.

1. [`addEvent(String eventId, This eventListener)`](/code/a11Y.java)

   Add an event listener via [`a11E`](/code/event/a11E.bsh).

2. [`removeEvent(String eventId)`](/code/a11Y.java)

   Remove a single event listener.

3. [`removeEvents()`](/code/a11Y.java)

   Remove all registered event listeners.

4. [`getEvents()`](/code/a11Y.java)

   Get a list of registered event IDs from the [`a11E`](/code/event/a11E.bsh) event manager.

### Execution helpers

1. [`execute(Runnable postRun)`](/code/a11Y.java)

   Run a `Runnable` asynchronously on the internal executor.

2. [`run(String fileName)`](/code/a11Y.java)

   Run a script file from the `ENV_PATH + "/scripts"` folder.
   - If `fileName` is not found directly, the method searches the scripts folder for a matching file name.
   - If the file cannot be found, it logs the error to `LOG_FILE`.

3. [`update()`](/code/a11Y.java)

   Check for updates via [`UpdateManager`](/code/lib/UpdateManager.bsh) and reload `a11Y` afterward.

4. [`updatePreRelease()`](/code/a11Y.java)

   Check for pre-release updates and reload `a11Y` afterward.

5. [`muteEvents()`](/code/a11Y.java)

   Mute event processing on the global [`a11E`](/code/event/a11E.bsh) manager.

6. [`unmuteEvents()`](/code/a11Y.java)

   Unmute event processing on the global [`a11E`](/code/event/a11E.bsh) manager.

### Accessibility service control

1. [`checkService()`](/code/a11Y.java)

   Return whether Tasker's accessibility service is currently available.

2. [`enableService()`](/code/a11Y.java)

   Use the internal `A11yController` helper to enable the accessibility service for the current package.

3. [`disableService()`](/code/a11Y.java)

   Use the internal `A11yController` helper to disable the accessibility service for the current package.

&nbsp;

# 4. Dependency & Dependant

a11Y depends on [`import.java`](/code/import.java) to load the shared helper methods from `/code/main`, `/code/actions`, `/code/others`, and `/code/gestures`.

The runtime also initializes:
- [`Environment()`](/code/main/Environment.bsh)
- [`Config(ENV_PATH + "/config.java")`](/code/config.java)
- [`MethodInspector(this)`](/code/lib/MethodInspector.bsh)
- [`AssistBar`](/code/assist/AssistBar.bsh), [`UpdateManager`](/code/lib/UpdateManager.bsh), and [`PackageManager`](/code/others/PackageManager.bsh)

[`StructureOverlay`](/code/assist/StructureOverlay.bsh), [`NodeBox`](/code/assist/NodeBox.bsh), [`InfoToast`](/code/assist/InfoToast.bsh), and [`InfoDialog`](/code/assist/InfoDialog.bsh) depend on `a11Y` for overlay lifecycle management.

Other helpers in `/code/actions`, `/code/main`, `/code/others`, and `/code/gestures` are independent and are loaded through `import.java`.
    
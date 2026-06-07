# [NodeInfo](/code/assist/NodeInfo.bsh)

Accessibility node metadata helper for node constants, group names, and property inspection.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`NodeInfo` creates a scripted object with internal vars and methods that act like a Java-like class. It is used by the assist UI and accessibility helpers.
It exposes methods such as `getConstantNames, getConstant, getGroupList, getGroupNames`.

# How to use

```java
info = NodeInfo(node);
```

```java
constants = info.getConstantNames();
```

## Return Value
Returns a scripted NodeInfo object.

## Flags & Usage

`NodeInfo` exposes many bit flags that describe node capabilities and states. Flags are available as named constants on the `NodeInfo` helper, for example `NodeInfo.CLICKABLE` and `NodeInfo.LONG_CLICKABLE`. You can also use `getConstant(name)` or `getConstantNames()` if you prefer string-based lookups.

Common constants:

| Constant | Description |
| -------- | ----------- |
| `NodeInfo.CHECKABLE` | Checkable |
| `NodeInfo.CHECKED` | Checked |
| `NodeInfo.FOCUSABLE` | Focusable |
| `NodeInfo.FOCUSED` | Focused |
| `NodeInfo.SELECTED` | Selected |
| `NodeInfo.CLICKABLE` | Clickable |
| `NodeInfo.LONG_CLICKABLE` | LongClickable |
| `NodeInfo.ENABLED` | Enabled |
| `NodeInfo.PASSWORD` | Password |
| `NodeInfo.SCROLLABLE` | Scrollable |
| `NodeInfo.ACCESSIBILITY_FOCUSED` | AccessibilityFocused |
| `NodeInfo.VISIBLE_TO_USER` | VisibleToUser |
| `NodeInfo.EDITABLE` | Editable |
| `NodeInfo.OPENS_POPUP` | OpensPopup |
| `NodeInfo.DISMISSABLE` | Dismissable |
| `NodeInfo.MULTI_LINE` | MultiLine |
| `NodeInfo.CONTENT_INVALID` | ContentInvalid |
| `NodeInfo.CONTEXT_CLICKABLE` | ContextClickable |
| `NodeInfo.IMPORTANCE` | Importance |
| `NodeInfo.SCREEN_READER_FOCUSABLE` | ScreenReaderFocusable |
| `NodeInfo.IS_SHOWING_HINT` | ShowingHint |
| `NodeInfo.IS_HEADING` | Heading |
| `NodeInfo.IS_TEXT_ENTRY_KEY` | TextEntryKey |
| `NodeInfo.IS_TEXT_SELECTABLE` | TextSelectable |
| `NodeInfo.REQUEST_INITIAL_ACCESSIBILITY_FOCUS` | RequestInitialAccessibilityFocus |
| `NodeInfo.ACCESSIBILITY_DATA_SENSITIVE` | DataSensitive |
| `NodeInfo.SUPPORTS_GRANULAR_SCROLLING` | SupportsGranularScrolling |
| `NodeInfo.FIELD_REQUIRED` | FieldRequired |
| `NodeInfo.HAS_VIEW_ID_RESOURCE_NAME` | Has View Id |
| `NodeInfo.HAS_TEXT` | Has Text |

Example:

```java
int flags = NodeInfo.CLICKABLE | NodeInfo.ENABLED; // prefer the NodeInfo.<CONST> constants
if (NodeInfo.hasAllProperties(node, flags)) {
	// node is clickable and enabled
}
```

You can also inspect flags grouping via `getGroupNames()` and `getGroupList(groupName)`.

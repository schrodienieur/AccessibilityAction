# [getDisplayIds](/code/main/getDisplayIds.bsh)

List active display IDs.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`getDisplayIds` queries the accessibility service for windows across all displays and returns the IDs of the active displays.

&nbsp;
# How to use

**Fetch available display IDs:**
```java
displays = getDisplayIds();
```

&nbsp;
**Log each display:**
```java
for (int i = 0; i < displays.size(); i++) {
  tasker.log("Display: " + displays.get(i));
}
```

&nbsp;
## Return Value
Returns an `ArrayList` of integers representing active display IDs, or an empty list if none are found.
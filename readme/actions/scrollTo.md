# [scrollTo](/code/actions/scrollTo.bsh)

Scroll to target node until it's found.
&nbsp;
# Dependencies
1. [findNodes](/readme/main/findNodes.md)
2. [hasNode](/readme/main/hasNode.md)
3. [showOnScreen](/readme/actions/showOnScreen.md)
4. [swipe](/readme/gestures/swipe.md)
5. [toNode](/readme/main/toNode.md)

&nbsp;
# How it works
Use [swipe](/readme/gestures/swipe.bsh) to scroll. After every scroll, run [findNodes](/readme/main/findNodes.bsh) to find target. If not found then scroll again until scroll count is reached.

&nbsp;
# How to use

**Scroll by text (simplest):**
Scrolls up to 20 times looking for a node with text "Login", scrolling from 80% to 20% of screen height.
```java
scrollTo("Login");
```


&nbsp;

**Scroll by custom attribute:**
Scrolls looking for a node with a specific resource-id.
```java
scrollTo(identifierKey, "com.example:id/button");
```

&nbsp;

**Customize scroll count:**
Scrolls up to 10 times instead of the default 20.
```java
scrollTo("Settings", 10);
```

&nbsp;

**Customize scroll range:**
Scrolls from 90% to 10% of screen height, up to 15 times.
```java
scrollTo("Profile", 15, 0.9, 0.1);
```

&nbsp;

**Full control:**
Scrolls with custom key, value, count, Y-positions, and duration (in milliseconds).
```java
scrollTo("text", "Submit", 25, 0.85, 0.15, 300);
```

&nbsp;

## Return Value
Returns the found node object, or `null` if not found after all scroll attempts.




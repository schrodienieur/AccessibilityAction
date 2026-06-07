# [createPaint](/code/gestures/createPaint.bsh)

Create a visual `Paint` style for gesture overlays.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`createPaint` builds an Android `Paint` object used to draw the gesture trail overlay. It sets stroke color, line width, anti-aliasing, and rounded corners for smooth overlay rendering.

&nbsp;
# How to use

**Create a simple paint style:**
Creates a white stroke that is 10 pixels thick with rounded corners.
```java
Paint paint = createPaint(0xFFFFFFFF, 10, 20);
```

&nbsp;
**Use paint with `gesture`:**
Draws the gesture path while dispatching the touch events.
```java
Object[][] points = new Object[][] {
  {0.5, 0.5, 0, 1L},
  {0.5, 0.8, 1, 200L},
  {0.5, 0.8, 2, 50L}
};
Paint paint = createPaint(0xFFFF0000, 8, 16);
gesture(points, paint);
```

&nbsp;
**Customize thickness and corner radius:**
```java
Paint paint = createPaint(0xFF00FF00, 12, 30);
```

&nbsp;
## Return Value
Returns the configured `Paint` object ready for drawing gesture trails.
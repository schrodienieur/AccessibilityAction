a11Y.set();

// File path for screenshot
String path = "/storage/emulated/0/ss.png";

// Targeting the node
node = getNode("id", "com.laurencedawson.reddit_sync:id/root");

// take screenshot of that node, might be better to target its parent, e.g node.getParent();
path = takeScreenshot(node, path);

// Share via sheet menu
shareFile(path);

// Share by targeting package
// shareFile(path, packageName);
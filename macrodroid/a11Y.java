String ENV_PATH = new File(getSourceFileInfo()).getParentFile().getAbsolutePath();
LOG_FILE = ENV_PATH + "/log.txt";

addClassPath(ENV_PATH);
importCommands("lib");
importCommands("lib.file");
importCommands("main");
import bsh.This;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;

This ENV = Environment();

if (ENV.MACRODROID) {
	This helper = macrodroidHelper();
	helper.set();
}

a11Y() {
	// Retrieve the previous instance from Tasker's memory
	This old = getA11yInstance();
	if (old != null) {
		try {
			boolean hasRemoveBoolean = old.namespace.getMethod("remove", new Class[] { Boolean.class }) != null;
			boolean hasRemove = old.namespace.getMethod("remove", new Class[] {}) != null;
			if (hasRemoveBoolean) {
				old.remove(false);
			} else if (hasRemove) {
				old.remove();
			} else {
				old.clean();
				old.removeAssist();
				old.removeEvents();
				old.executor.shutdownNow();
			}
		} catch (Exception e) {}
	}

	final This TOP = this;

	// Variables
	List assistOverlays = new ArrayList();
	This ENV;
	String ENV_PATH;
	String LOG_FILE;
	long lastActionPickerReminder = 0;

	This assistBar;
	This updateManager;
	This materialColorFallback;
	This displayInfos;
	String scriptEditor = "";
	This inspector;
	This NodeInfo;
	This config;
	Handler mainHandler = new Handler(Looper.getMainLooper());

	ThreadFactory customThreadFactory = new ThreadFactory() {
		private AtomicInteger count = new AtomicInteger(0);
		public Thread newThread(Runnable r) {
			Thread thread = new Thread(r, "a11Y_" + count.incrementAndGet());
			thread.setPriority(Thread.MAX_PRIORITY);
			return thread;
		}
	};

	ThreadPoolExecutor executor = new ThreadPoolExecutor(
		1, // Core size
		1, // Max size
		30, // Idle timeout
		TimeUnit.SECONDS, // Timeout unit
		new ArrayBlockingQueue(1), // Task wait-list
		customThreadFactory, // Thread factory
		new ThreadPoolExecutor.DiscardOldestPolicy()
	);

	reload() {
		executor.execute(new Runnable() {
			run() {
				try {
					if (ENV_PATH != null) source(ENV_PATH + "/a11Y.java");
				} catch (e) {
					log(e.getMessage(), "ERROR");
				}
			}
		});
	}

	debug() {
		debugMe = true;
	}

	set(This THIS) {
		config.setTo(TOP, THIS);
		if (ENV != null) THIS.namespace.setVariable("ENV", ENV, false);
		if (NodeInfo != null) THIS.namespace.setVariable("NodeInfo", NodeInfo, false);
		this.interpreter.source(ENV_PATH + "/import.java");
		return THIS;
	}

	set() {
		set(this.caller);
	}

	setEnvPath(String path) {
		ENV_PATH = path;
		LOG_FILE = path + "/log.txt";
	}

	setEnv(This env) {
		ENV = env;
	}

	resetEnv() {
		ENV_PATH = null;
	}

	reset() {
		config.setTo(TOP);
	}

	addOverlay(This overlay) {
		assistOverlays.add(overlay);
	};

	removeOverlay(This overlay) {
		assistOverlays.remove(overlay);
	}

	clean() {
		if (assistOverlays.isEmpty()) return;
		for (This overlay: assistOverlays) {
			try { overlay.remove(); } catch (e) {}
		}
		assistOverlays.clear();
	}

	addEvent(String eventId, This eventListener) {}

	removeEvent(String eventId) {}

	removeEvents() {}

	getEvents() {}

	if (old != null) {
		if (old.scriptEditor != void) scriptEditor = old.scriptEditor;
	}

	showAssist() {
		if (!assistBar.isShown) assistBar.show();
	}

	removeAssist() {
		if (assistBar.isShown) assistBar.remove();
	}

	update() {
		if (updateManager != null) {
			if (updatePreRelease) {
				updateManager.updatePreRelease();
			}
			else {
				updateManager.update();
			}
		}

		reload();

	}

	updatePreRelease() {
		if (updateManager != null) {
			updateManager.updatePreRelease();
			reload();
		}
	}

	muteEvents() {}

	unmuteEvents() {}

	execute(Runnable postRun) {
		executor.execute(postRun);
	}

	run(String fileName) {
		Runnable runMe = new Runnable() {
			run() {
				try {
					String scriptDirName = "/scripts";
					String fullPath = ENV_PATH + scriptDirName;
					File target = new File(fullPath, fileName);
					if (!target.exists()) {
						File directory = new File(fullPath);
						File[] files = directory.listFiles();
						if (files != null) {
							for (File file: files) {
								if (file.isFile()) {
									if (file.getName().equals(fileName)) {
										target = file;
										break;
									}
								}
							}
						}
					}
					if (target.exists()) {
						this.interpreter.source(target.getAbsolutePath());
					} else {
						log("File not found: " + fileName + " in " + scriptDirName, "ERROR");
					}
				} catch (Exception e) {
					log(e.getMessage(), "ERROR");
				}
			}
		};
		execute(runMe);
	}

	testDisplay() {
		if (displayInfos == null) {
			set();
			displayInfos = DisplayInfos();
		}
		displayInfos.show(6000);
	}

	post(Runnable run) {
		mainHandler.post(run);
	}

	remove(boolean clearA11Y) {
		log("Removing a11Y", TOP);
		clean();
		removeAssist();
		removeEvents();
		executor.shutdownNow();
		if (clearA11Y) tasker.setJavaVariable("a11Y", null);
	}

	remove() {
		remove(true);
	}

	checkService() {
		return tasker.getAccessibilityService() != null;
	}

	enableService() {
		if (a11yController == null) a11yController = A11yController();
		String packageName = context.getPackageName();
		a11yController.enableService(packageName);
	}

	disableService() {
		if (a11yController == null) a11yController = A11yController();
		String packageName = context.getPackageName();
		a11yController.disableService(packageName);
	}

	long startTime = System.currentTimeMillis();
	return this;

};

log("Initializing a11Y");
This a11Y = a11Y();
a11Y.setEnvPath(ENV_PATH);
a11Y.setEnv(ENV);

This viewControl = ViewControl();
a11Y.namespace.setVariable("viewControl", viewControl, false);

This config = Config(ENV_PATH + "/config.java");
config.load();
config.setTo(a11Y);

a11Y.namespace.setVariable("config", config, false);
a11Y.set();

This inspector = MethodInspector(this);
inspector.read();
a11Y.inspector = inspector;
tasker.setJavaVariable("a11Y", a11Y);

This a11yController = A11yController();
a11Y.namespace.setVariable("a11yController", a11yController, false);

This NodeInfo = NodeInfo();
a11Y.namespace.setVariable("NodeInfo", NodeInfo, false);

This updateManager = UpdateManager();
updateManager.namespace.setVariable("directoryPath", ENV_PATH, false);
a11Y.namespace.setVariable("updateManager", updateManager, false);

This packageManager = PackageManager();
a11Y.namespace.setVariable("packageManager", packageManager, false);

// Limit following methods and scripted objects to Tasker app
if (!ENV.HAS_MATERIAL_LIB) return;

This assistBar = AssistBar(0.8, 0.8);
a11Y.namespace.setVariable("assistBar", assistBar, false);

if (!ENV.HAS_MATERIAL_COLOR && ENV.HAS_MATERIAL_COLOR_FALLBACK) {
	This mcf = MaterialColorFallback();
	a11Y.namespace.setVariable("materialColorFallback", mcf, false);
	mcf.load();
	log("Using fallback material color.");
	tasker.showToast("Can't find material color via ThemeManager.color(String). Will try to use a fallback that doesn't match the theme.\n\nAccessibility actions still can be used.", "Assist & Debug features may not work.");
}

log("a11Y initialized and send start command");
tasker.sendCommand("a11Y=:=start");
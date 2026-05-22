import bsh.This;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;

a11Y() {
	Field propertiesField = AccessibilityNodeInfo.class.getDeclaredField("mBooleanProperties");
    propertiesField.setAccessible(true);
	// 1. Retrieve the previous instance from Tasker's memory
	This old = tasker.getJavaVariable("a11Y");
	if (old != null) {
		try {
			if (old.executor != void && old.executor != null) {
				if (!old.executor.isShutdown()) {
					old.executor.shutdownNow();
				}
			}
			old.removeAssist();
		} catch (Exception e) {}

	}

	boolean debugSteps = false;
	boolean debugMe = false;
	boolean debugInfo = true;
	long findDelay = 100;
	long debugDelay = 1000;
	long stepDelay = 50;
	long waitNodesTimeout = 10000;
	List assistOverlays = new ArrayList();
	String ENV_PATH;
	This assistButton;
	This updateManager;
	boolean useOffset = true;
	boolean useA11yOffset = true;
	boolean waitNodes = true;
	boolean useA11yStructure = false;
	boolean includeAllMethods = false;
	boolean quickAddMode = true;
	boolean updatePreRelease = false;
	long lastActionPickerReminder = 0;
	long actionPickerReminderDelay = 120000;
	This TOP;
	This materialColorFallback;
	This ENV;
	This displayInfos;
	String scriptEditor = "";
	This inspector;
	This NodeFilter;
	String LOG_FILE;

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
					tasker.logAndToast(e.getMessage(), LOG_FILE);
				}
			}
		});
	}

	debug() {
		debugMe = true;
	}

	set(This THIS) {
		THIS.namespace.setVariable("debugMe", debugMe, false);
		THIS.namespace.setVariable("debugSteps", debugSteps, false);
		THIS.namespace.setVariable("debugInfo", debugInfo, false);
		THIS.namespace.setVariable("findDelay", findDelay, false);
		THIS.namespace.setVariable("debugDelay", debugDelay, false);
		THIS.namespace.setVariable("useOffset", useOffset, false);
		THIS.namespace.setVariable("useA11yOffset", useA11yOffset, false);
		THIS.namespace.setVariable("waitNodes", waitNodes, false);
		THIS.namespace.setVariable("useA11yStructure", useA11yStructure, false);
		THIS.namespace.setVariable("includeAllMethods", includeAllMethods, false);
		THIS.namespace.setVariable("quickAddMode", quickAddMode, false);
		THIS.namespace.setVariable("stepDelay", stepDelay, false);
		THIS.namespace.setVariable("waitNodesTimeout", waitNodesTimeout, false);
		if (ENV != null) THIS.namespace.setVariable("ENV", ENV, false);
		if (NodeFilter != null) THIS.namespace.setVariable("NodeFilter", NodeFilter, false);
		if (ENV_PATH == null) {
			String superImport = tasker.getVariable("ImportJava");
			try {
				this.interpreter.source(superImport);
				THIS.invokeMethod("IMPORT", new Object[] { "AccessibilityAction" });
				if (THIS.namespace.getVariable("MAIN_DIRECTORY") != null) ENV_PATH = THIS.namespace.getVariable("MAIN_DIRECTORY");
				THIS.namespace.setVariable("a11Y", THIS, false);
			} catch (e) {
				tasker.showToast("Please set the folder with a11Y.setEnvPath(\"Directory path\")");
				return;
			}
		} else {
			this.interpreter.source(ENV_PATH + "/import.java");
		}
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
		debugSteps = false;
		debugMe = false;
		debugInfo = true;
		findDelay = 100;
		debugDelay = 1000;
		useOffset = true;
		useA11yOffset = true;
		waitNodes = true;
		useA11yStructure = false;
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

	addEvent(String eventId, This eventListener) {
		This a11E = tasker.getJavaVariable("a11E");
		if (a11E != null) a11E.add(eventId, eventListener);
	}

	removeEvent(String eventId) {
		This a11E = tasker.getJavaVariable("a11E");
		if (a11E != null) a11E.remove(eventId);
	}

	removeEvents() {
		This a11E = tasker.getJavaVariable("a11E");
		if (a11E != null) a11E.removeEvents();
	}

	getEvents() {
		This a11E = tasker.getJavaVariable("a11E");
		if (a11E != null) {
			Set keyset = a11E.listeners.keySet();
			return new ArrayList(keyset);
		}
	}

	if (old != null) {
		if (old.scriptEditor != void) scriptEditor = old.scriptEditor;
	}

	showAssist() {
		if (!assistButton.isShown) assistButton.show();
	}

	removeAssist() {
		if (assistButton.isShown) assistButton.remove();
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

	muteEvents() {
		This a11E = tasker.getJavaVariable("a11E");
		a11E.mute();
	}

	unmuteEvents() {
		This a11E = tasker.getJavaVariable("a11E");
		a11E.unmute();
	}

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
						tasker.log("File not found: " + fileName + " in " + scriptDirName, LOG_FILE);
					}
				} catch (Exception e) {
					tasker.logAndToast(e.getMessage(), LOG_FILE);
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

	long startTime = System.currentTimeMillis();
	return this;

};

String ENV_PATH = new File(getSourceFileInfo()).getParentFile().getAbsolutePath();
addClassPath(ENV_PATH);
importCommands("lib");
importCommands("main");
This a11Y = a11Y();
a11Y.setEnvPath(ENV_PATH);

This Env = Environment();
a11Y.setEnv(Env);

This config = Config(ENV_PATH + "/config.java");
config.setTo(a11Y);
a11Y.set();

This inspector = MethodInspector(this);
inspector.read();
a11Y.inspector = inspector;
tasker.setJavaVariable("a11Y", a11Y);

This a11E = a11E();
tasker.setJavaVariable("a11E", a11E);

This NodeFilter = NodeFilter();
a11Y.namespace.setVariable("NodeFilter", NodeFilter, false);
// Limit following methods and scripted objects to Tasker app
if (!Env.HAS_MATERIAL_LIB) return;

This assistButton = AssistButton(0.8, 0.8);
a11Y.namespace.setVariable("assistButton", assistButton, false);

This updateManager = UpdateManager();
updateManager.namespace.setVariable("directoryPath", ENV_PATH, false);
a11Y.namespace.setVariable("updateManager", updateManager, false);

This packageManager = PackageManager();
a11Y.namespace.setVariable("packageManager", packageManager, false);

if (!Env.HAS_MATERIAL_COLOR && Env.HAS_MATERIAL_COLOR_FALLBACK) {
	This mcf = MaterialColorFallback();
	mcf.load();
	tasker.showToast("Can't find material color via ThemeManager.color(String). Will try to use a fallback that doesn't match the theme.\n\nAccessibility actions still can be used.", "Assist & Debug features may not work.");
}

tasker.sendCommand("a11Y=:=start");
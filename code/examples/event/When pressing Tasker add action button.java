a11Y.set();
myEvent() {
	String PackageName = "net.dinglisch.android.taskerm";

	Source() {
		String ViewIdResourceName = "net.dinglisch.android.taskerm:id/button_add_action";
		return this;
	}

	onViewClicked(Object event) {
		click("Filter");
	}

	onViewLongClicked(Object event) {
		tasker.showToast("Quick Actions");
	}

	return this;
}

myEvent = myEvent();
a11Y.removeEvent("myEvent");
a11Y.addEvent("myEvent", myEvent);


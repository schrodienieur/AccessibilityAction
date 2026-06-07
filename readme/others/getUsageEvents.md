# [getUsageEvents](/code/others/getUsageEvents.bsh)

Retrieve application usage events and foreground activity information.

&nbsp;
# Dependencies
1. [currentPackage](/readme/others/currentPackage.md)

&nbsp;
# How it works
`getUsageEvents` queries the system's `UsageStatsManager` to retrieve recent application foreground/background transitions. It filters events by type and returns them in chronological order.

&nbsp;
# How to use

**Get usage events (default parameters):**
```java
events = getUsageEvents();
```

&nbsp;
**Get events within time window (milliseconds):**
```java
events = getUsageEvents(3600000);  // Last hour
```

&nbsp;
**Filter by event types:**
```java
eventTypes = ["MOVE_TO_FOREGROUND", "MOVE_TO_BACKGROUND"];
events = getUsageEvents(3600000, eventTypes);
```

&nbsp;
**Get raw ArrayList instead of JSON:**
```java
events = getUsageEvents(3600000, null, 50, true);
```

&nbsp;
## Return Value
Returns usage events as a JSON string or ArrayList<HashMap>, containing event details like `packageName`, `eventType`, and `timestamp`.

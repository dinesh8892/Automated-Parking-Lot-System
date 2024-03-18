package org.example;

public class EntryTicket {

    private final String id;
    private final long entryTimeInMillis;
    private final int floorId;
    private final String assignedSpotId;

    public EntryTicket(String id, long entryTimeInMillis, int floorId, String assignedSpotId) {
        this.id = id;
        this.entryTimeInMillis = entryTimeInMillis;
        this.floorId = floorId;
        this.assignedSpotId = assignedSpotId;
    }

    public String getId() {
        return id;
    }

    public long getEntryTimeInMillis() {
        return entryTimeInMillis;
    }

    public int getFloorId() {
        return floorId;
    }

    public String getAssignedSpotId() {
        return assignedSpotId;
    }
}

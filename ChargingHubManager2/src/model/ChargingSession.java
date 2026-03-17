package model;

public class ChargingSession {

    private String sessionID;
    private String deviceID;
    private String hubID;
    private String startTime;
    private String endTime;

    public ChargingSession(String sessionID, String deviceID, String hubID, String startTime) {
        this.sessionID = sessionID;
        this.deviceID = deviceID;
        this.hubID = hubID;
        this.startTime = startTime;
    }

    public void endSession(String endTime) {
        this.endTime = endTime;
    }

    public String getSessionID() {
        return sessionID;
    }
}
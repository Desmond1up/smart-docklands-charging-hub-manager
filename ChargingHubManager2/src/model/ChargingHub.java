package model;

public class ChargingHub {

    private String hubID;
    private String location;
    private int totalPorts;
    private int availablePorts;

    public ChargingHub(String hubID, String location, int totalPorts) {
        this.hubID = hubID;
        this.location = location;
        this.totalPorts = totalPorts;
        this.availablePorts = totalPorts;
    }

    public String getHubID() {
        return hubID;
    }

    public String getLocation() {
        return location;
    }

    public int getAvailablePorts() {
        return availablePorts;
    }

    public void occupyPort() {
        if (availablePorts > 0) {
            availablePorts--;
        }
    }

    public void freePort() {
        if (availablePorts < totalPorts) {
            availablePorts++;
        }
    }
}
package model;

public abstract class Device {

    protected String deviceID;
    protected int batteryLevel;

    public Device(String deviceID, int batteryLevel) {
        this.deviceID = deviceID;
        this.batteryLevel = batteryLevel;
    }

    public void startCharging() {
        System.out.println("Charging started for device: " + deviceID);
    }

    public void stopCharging() {
        System.out.println("Charging stopped for device: " + deviceID);
    }

    public abstract int calculateChargingTime();
}
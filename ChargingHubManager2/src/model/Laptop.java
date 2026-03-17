package model;

public class Laptop extends Device {

    public Laptop(String deviceID, int batteryLevel) {
        super(deviceID, batteryLevel);
    }

    @Override
    public int calculateChargingTime() {
        return (100 - batteryLevel) * 4;
    }
}

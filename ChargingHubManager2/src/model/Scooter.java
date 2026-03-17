package model;

public class Scooter extends Device {

    public Scooter(String deviceID, int batteryLevel) {
        super(deviceID, batteryLevel);
    }

    @Override
    public int calculateChargingTime() {
        return (100 - batteryLevel) * 3;
    }
}
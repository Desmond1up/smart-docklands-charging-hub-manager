package model;

public class Phone extends Device {

    public Phone(String deviceID, int batteryLevel) {
        super(deviceID, batteryLevel);
    }

    @Override
    public int calculateChargingTime() {
        return (100 - batteryLevel) * 2;
    }
}

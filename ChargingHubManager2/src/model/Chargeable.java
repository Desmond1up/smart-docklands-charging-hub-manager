package model;

public interface Chargeable {

    void startCharging();

    void stopCharging();

    int calculateChargingTime();
}
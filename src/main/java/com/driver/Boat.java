package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int vehicleCapacity;

    @Override
    public String getVehicleName() {
       this.name = name;
       return name;
    }

    @Override
    public int getVehicleCapacity() {
        this.vehicleCapacity = vehicleCapacity;
        return vehicleCapacity;

    }
}

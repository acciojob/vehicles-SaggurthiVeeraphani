package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int vehicleCapacity;

    public Boat(){

    }
    public Boat(String name,int vehicleCapacity){
        this.name = name;
        this.vehicleCapacity = vehicleCapacity;
    }

    @Override
    public String getVehicleName() {
       return name;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;

    }
}

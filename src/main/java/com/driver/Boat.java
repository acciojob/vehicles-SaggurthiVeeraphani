package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int vehicleCapacity;

    public Boat(){

    }
    public Boat(String name,int vehicleCapacity){
        this.name = name;
        this.vehicleCapacity = vehicleCapacity;
    }
    public String getVehicleName() {
       return name;
    }
    public int getVehicleCapacity() {
        return vehicleCapacity;

    }
}

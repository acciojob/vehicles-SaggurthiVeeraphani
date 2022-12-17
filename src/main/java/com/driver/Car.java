package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    public boolean isManual;
    private int currentGear;
    private int seats;



    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super();
        this.wheels = wheels;
       this.doors = doors;
       this.gears = gears;
       this.isManual = isManual;
       this.type = type;
       this.seats = seats;
    }
    public Car(){
        this.name = name;
        this.isManual = isManual;
    }

    public void changeGear(int newGear){
       currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
       this.currentSpeed = newSpeed;
       this.currentDirection = newDirection;
       System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}

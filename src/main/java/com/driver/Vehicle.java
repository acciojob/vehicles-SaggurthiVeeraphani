package com.driver;

public class Vehicle {

    public String name;
    public int currentSpeed = 0;
    public int currentDirection = 0;

    public Vehicle() {
          this.name = name;
    }

    public void steer(int direction){
        currentDirection = currentDirection + direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}

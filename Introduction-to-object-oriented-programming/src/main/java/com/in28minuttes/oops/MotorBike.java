package com.in28minuttes.oops;

public class MotorBike {
    //state
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start(){
        System.out.println("Bike Started");
    }
}
package com.in28minuttes.oops;

public class MotorBike {
    //state
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
        //System.out.println(speed);
        //System.out.println(this.speed);
        this.speed = speed;
        //System.out.println(speed);
        //System.out.println(this.speed);
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch){
        if(this.speed > howMuch)
        this.speed = this.speed - howMuch;
    }

    void start(){
        System.out.println("Bike Started");
    }
}

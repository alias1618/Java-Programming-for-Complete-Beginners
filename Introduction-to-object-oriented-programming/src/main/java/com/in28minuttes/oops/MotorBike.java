package com.in28minuttes.oops;

public class MotorBike {
    //state
    private int speed;

    MotorBike(){
        this(5);
    }

    MotorBike(int speed){
        this.speed = speed;
    }

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
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch){
        //if(this.speed - howMuch > 0)  老師寫的方式
        //if(this.speed > howMuch)      我寫的方式
        //另一種方式
        setSpeed(this.speed - howMuch);
        //this.speed = this.speed - howMuch;
    }

    void start(){
        System.out.println("Bike Started");
    }
}

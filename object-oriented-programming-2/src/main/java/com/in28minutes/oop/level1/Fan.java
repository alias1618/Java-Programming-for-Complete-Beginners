package com.in28minutes.oop.level1;

public class Fan {

    //state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; //1 to 5

    //creation
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //print
    public String toString(){
       return String.format( "make - %s" + "radius - %f, color - %s , isOn - %b , speed - %d", make, radius, color, isOn, speed);
    }
}

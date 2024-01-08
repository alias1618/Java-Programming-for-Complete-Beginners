package com.in28minuttes.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        int ducatiSpeed = ducati.getSpeed();    //get ducati speed
        ducatiSpeed = ducatiSpeed + 100;        //increase it by 100
        ducati.setSpeed(ducatiSpeed);           //set it to ducati

        int hondaSpeed = honda.getSpeed();      // get honda speed
        hondaSpeed = hondaSpeed + 100;          //increase it by 100
        honda.setSpeed(hondaSpeed);             //set it to honda


        System.out.println(ducati.getSpeed());
//
//        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

    }
}

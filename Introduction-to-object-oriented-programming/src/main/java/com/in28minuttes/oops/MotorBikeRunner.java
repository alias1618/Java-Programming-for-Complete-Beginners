package com.in28minuttes.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(250);
        honda.decreaseSpeed(250);


        System.out.println(ducati.getSpeed());
//
//        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

    }
}

package com.in28minutes.oop.level2.interfaces._2;

public class Project {
    public static void main(String[] args) {

        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10, 20));
    }
}

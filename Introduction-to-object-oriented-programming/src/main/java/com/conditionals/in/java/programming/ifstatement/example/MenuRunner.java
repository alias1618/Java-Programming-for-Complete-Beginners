package com.conditionals.in.java.programming.ifstatement.example;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1);
    }
}

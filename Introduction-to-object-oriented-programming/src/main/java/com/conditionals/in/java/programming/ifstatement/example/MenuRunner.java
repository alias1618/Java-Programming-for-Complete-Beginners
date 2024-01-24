package com.conditionals.in.java.programming.ifstatement.example;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
        //System.out.println("The number you entered is - " + number1);

        System.out.println("Enter Number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices Available are ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.println("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.println("Your Choice are");
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
        System.out.println("Choice " + choice);

        //int result = performOperationUsingNestedIfElse(number1, number2, choice);

        int result = performOperationUsingSwitch(number1, number2, choice);

        System.out.println("Result is -" + result);
    }

    private static int performOperationUsingNestedIfElse(int number1, int number2, int choice) {
        int result = 0;
        if(choice == 1){
            result = number1 + number2;
        }else if(choice == 2){
            result = number1 - number2;
        }else if(choice == 3){
            result = number1 / number2;
        }else if(choice == 4){
            result = number1 * number2;
        }else{
            System.out.println("Invalid Operation");
        }
        return result;
    }

    private static int performOperationUsingSwitch(int number1, int number2, int choice) {
        int result = 0;
        switch (choice){
            case 1 :
                result = number1 + number2;
                break;
            case 2 :
                result = number1 - number2;
                break;
            case 3 :
                result = number1 / number2;
                break;
            case 4 :
                result = number1 * number2;
                break;
            default: System.out.println("Invalid Operation");
        }

        return result;
    }
}

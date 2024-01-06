package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.coding.exercise.isleap.year;

/*
* Coding Exercise: Is Leap Year
You are given a class LeapYearChecker with a method isLeapYear(int year). Your task is to complete the implementation of the method to determine if a given year is a leap year.

The rules are a little tricky. Read them carefully.

A year is a leap year in the Gregorian calendar if:

It is divisible by 4 (AND)

It is NOT divisible by 100 (except when it is divisible by 400)

Not Divisible by 4 - NOT Leap Year (2041)

Divisible by 4 and NOT divisible by 100 - Leap Year (2048)

Divisible by 4 and divisible by 100 - Additional check needed

Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)

Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)

Instructions

Implement the isLeapYear method to return true if the year is a leap year and false otherwise.

You need to account for the edge case where the year is less than 1. For such a case, the method should return false.

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
       // Implement your code here
    }
}
Please ensure your code passes all the test cases, including edge cases, and adheres to the above guidelines.
* */
public class LeapYearChecker {
    public boolean isLeapYear(int year) {

        if(year < 1){
            return false;
        }

        int number4 = (year%4);
        System.out.println(number4);

        int number100 = (year%100);
        System.out.println(number100);

        int number400 = (year%400);
        System.out.println(number400);

        if( number4 != 0 ){
            return false;
        }

        if( number100 != 0 ){
            return true;
        }

        if( number400 != 0){
            return false;
        }

        return true;
    }
}

package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.coding.exercise.isleap.year;

/*
* The solution involves applying the rules for determining if a year is a leap year or not. These rules are as follows:

The year must be divisible by 4.

If the year is divisible by 100, it's not a leap year unless it's also divisible by 400.

Here's a step-by-step explanation of the code:

public class LeapYearChecker {

    public boolean isLeapYear(int year) {

        if (year < 1) {
            return false;
        }

        //2041 - No
        if (year % 4 != 0) {
            return false;
        }

        //2048 - Yes
        if (year % 100 != 0) {
            return true;
        }


        if(year % 400 != 0) {
            //2000, 2400 - Yes
            return false;
        }

        return true;

    }

}



Begin by checking if the given year is less than 1. If it is, return false as it's not a valid year.

Check if the year is divisible by 4. If it's not, return false.

Check if the year is NOT divisible by 100. If it's not, return true.

Check if the year is NOT divisible by 400. If it is not, return false.

If none of the above conditions are met, it means the year is a leap year, so return true.
* */
public class LeapYearChecker2 {
    public boolean isLeapYear(int year) {

        if (year < 1) {
            return false;
        }

        //2041 - No
        if (year % 4 != 0) {
            return false;
        }

        //2048 - Yes
        if (year % 100 != 0) {
            return true;
        }


        if(year % 400 != 0) {
            //2000, 2400 - Yes
            return false;
        }

        return true;

    }
}

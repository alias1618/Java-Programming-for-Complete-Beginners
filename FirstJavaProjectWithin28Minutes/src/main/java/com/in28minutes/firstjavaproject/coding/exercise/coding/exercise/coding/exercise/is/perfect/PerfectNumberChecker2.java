package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.coding.exercise.is.perfect;


/*
*
* A perfect number is a positive integer that is equal to the sum of its positive divisors excluding itself.

Here is the Java solution with explanations for the isPerfectNumber method:

public class PerfectNumberChecker {

    public boolean isPerfectNumber(int number) {
        // A perfect number must be a positive integer
        // If the input number is less than or equal to 0, we immediately return false.
        if (number <= 0) {
            return false;
        }

        // Initialize a variable to store the sum of the divisors
        int divisorSum = 0;

        // Loop over all numbers from 1 to the input number (exclusive)
        for (int i = 1; i < number; i++) {
            // If the number is divisible by i (i is a divisor), add i to the sum
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        // After the loop, if the sum of divisors equals the input number,
        // the number is perfect. Return true in this case. Otherwise, return false.
        return divisorSum == number;
    }
}
This solution iterates over all numbers from 1 up to the input number and checks whether each number is a divisor. If so, the divisor is added to the sum. Finally, the method checks if the sum of the divisors is equal to the input number, which would make it a perfect number.
*
* */
public class PerfectNumberChecker2 {
    public boolean isPerfectNumber(int number) {
        // A perfect number must be a positive integer
        // If the input number is less than or equal to 0, we immediately return false.
        if (number <= 0) {
            return false;
        }

        // Initialize a variable to store the sum of the divisors
        int divisorSum = 0;

        // Loop over all numbers from 1 to the input number (exclusive)
        for (int i = 1; i < number; i++) {
            // If the number is divisible by i (i is a divisor), add i to the sum
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        // After the loop, if the sum of divisors equals the input number,
        // the number is perfect. Return true in this case. Otherwise, return false.
        return divisorSum == number;
    }
}

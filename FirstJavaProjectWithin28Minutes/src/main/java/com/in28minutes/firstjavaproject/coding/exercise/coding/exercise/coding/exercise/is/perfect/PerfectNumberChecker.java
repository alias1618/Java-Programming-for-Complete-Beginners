package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.coding.exercise.is.perfect;

/*
* Hint 1

Remember that a perfect number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself. So, you need to find the divisors of the number first. The divisors can be found by looping from 1 to the given number and checking if the number is divisible by the loop variable.

Hint 2

You should create a variable divisorSum to keep track of the sum of the divisors. Initialize it to zero and increment it with the current loop variable value whenever you find a divisor.

Hint 3

Finally, after the loop, compare the divisorSum with the original number. If they are equal, return true. Otherwise, return false.

Hint 4

Check for an early exit condition. If the number is less than or equal to 0, it can't be a perfect number, so return false immediately.
*
* */
public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {

        if(number <= 0){
            return false;
        }

        int divisorSum = 0;

        for(int i=1; i< number; i++){
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum == number;
    }
}

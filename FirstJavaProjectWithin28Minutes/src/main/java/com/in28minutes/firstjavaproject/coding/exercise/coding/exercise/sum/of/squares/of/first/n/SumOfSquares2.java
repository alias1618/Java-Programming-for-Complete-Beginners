package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.sum.of.squares.of.first.n;


/*老師寫的
*
* 提示
* The square of a number i can be calculated as i * i.

Consider using a for loop to implement the summation.

Iterate from 1 to n. In each iteration, square the current number and add it to a running total.

Don't forget to check if n is less than 0. If it is, return -1.

Try to implement these steps in your code. Good luck!
*
*
* 解答
*
* The task requires you to calculate the sum of squares of all numbers up to a given number n.

The solution leverages a simple for loop to iterate over all integers from 1 to n inclusive. For each integer i, it squares the integer and adds it to a running total (sum), which is initialized to 0 at the start of the function.

At the beginning, we add a check to ensure n is non-negative. If n is less than 0, the function returns -1 as an indication of invalid input.
*
* This solution correctly calculates the sum of squares of all numbers up to n for all non-negative values of n.
* */
public class SumOfSquares2 {
    public long calculateSumOfSquares(int n) {

        // if n is less than 0, return -1 to indicate invalid input
        if (n < 0) {
            return -1;
        }

        // initialize sum to 0
        long sum = 0;

        // iterate over all numbers from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // square the current number and add it to the sum
            sum += i * i;
        }

        // return the calculated sum of squares
        return sum;
    }
}

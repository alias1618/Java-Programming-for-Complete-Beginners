package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.sum.of.squares.of.first.n;

/*
* 題目
* Coding Exercise: Sum of Squares of First N Numbers
You are given an integer n. Your task is to implement a method calculateSumOfSquares in the class SumOfSquares that calculates and returns the sum of squares of all positive integers up to n (inclusive).

For example, if n = 3, the method should return the sum 1^2 + 2^2 + 3^2 = 14.

If n is less than 0, the method should return -1.

Instructions

The incomplete code provided contains a class named SumOfSquares with a method signature public long calculateSumOfSquares(int n).

Complete this method to calculate the sum of squares of all positive integers up to n. If n is less than 0, return -1.

Do not print anything in your code. The method should return the sum or -1.

public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
    }
}
Good luck!
* */
public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
        // write your code here
        if(n < 0){
            return -1;
        }
        long sum = 0;
        for(long i = 1; i <= n; i++ ){
            sum = sum + (i * i);
        }
        return sum;
    }
}

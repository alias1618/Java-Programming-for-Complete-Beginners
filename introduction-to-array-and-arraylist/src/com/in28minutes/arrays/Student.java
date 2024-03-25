package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = Integer.MIN_VALUE;
        for(int mark:marks){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getminimumMark() {
        int mini = Integer.MAX_VALUE;
        for(int mark:marks){
            if(mark < mini  ){
                mini = mark;
            }
        }
        return mini;
    }

    public BigDecimal getAverageMarks() {
        //第一種寫法
//        int sum = getTotalSumOfMarks();
//        int number = getNumberOfMarks();
//
//        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

        //第二種寫法
        BigDecimal  sum = BigDecimal.valueOf(getTotalSumOfMarks());
        BigDecimal  number = BigDecimal.valueOf(getNumberOfMarks());

        return (sum.divide(number, 3, RoundingMode.UP));
    }
}
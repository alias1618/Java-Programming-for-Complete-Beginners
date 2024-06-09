package com.in28minutes.arrays._205.Step_05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private final String name;
    private final int[] marks;

    public  Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for(int mark : marks){
            if (maximum < mark){
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for(int mark : marks){
            if (minimum > mark){
                minimum = mark;
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}

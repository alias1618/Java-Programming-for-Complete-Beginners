package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        //int[] marks = {97, 98, 100};

        //Student student = new Student("Ranga", marks);
        Student student = new Student("Ranga", 97, 98, 100);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks "+number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks "+sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("maximum of marks "+maximumMark);

        int minimumMark = student.getminimumMark();
        System.out.println("minimumMark of marks "+minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("average of marks "+average);
    }
}

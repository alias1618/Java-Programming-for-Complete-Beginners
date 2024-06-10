package com.in28minutes.arrays._216.Step_14;

import com.in28minutes.arrays._216.Step_14.Student;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {99, 98, 100};

        Student student = new Student("Ranga", marks);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("maximum of marks: " + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("minimum of marks: " + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("average: " + average);

        System.out.println(student);

        student.addNewMark(35);

        System.out.println(student);

        student.removeMarkAtIndex(1);

    }
}

package com.in28minutes.firstjavaproject.coding.exercise.exam.result;

//我寫的
public class ExamResult {
    public boolean isPass(int marks) {

        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if(marks > 50){
            return true;
        }

        return false;
    }
}
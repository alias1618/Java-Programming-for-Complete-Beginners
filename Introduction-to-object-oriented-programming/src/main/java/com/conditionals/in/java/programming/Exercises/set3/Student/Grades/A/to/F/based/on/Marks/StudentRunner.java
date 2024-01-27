package com.conditionals.in.java.programming.Exercises.set3.Student.Grades.A.to.F.based.on.Marks;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student(85);
        System.out.println(student.assignGrade()); // Should print 'B'
        student = new Student(101);
        System.out.println(student.assignGrade()); // Should print 'X'
    }
}

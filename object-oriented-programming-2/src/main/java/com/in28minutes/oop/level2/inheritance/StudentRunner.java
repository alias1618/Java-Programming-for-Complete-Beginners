package com.in28minutes.oop.level2.inheritance;

public class StudentRunner {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Ranga");
//        student.setEmail("in28minutes@gmail.com");

        Employee employee = new Employee("Ranga", "Programmer Analyst");
        employee.setName("Ranga");
        employee.setEmail("Ranga@in28minutes.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}

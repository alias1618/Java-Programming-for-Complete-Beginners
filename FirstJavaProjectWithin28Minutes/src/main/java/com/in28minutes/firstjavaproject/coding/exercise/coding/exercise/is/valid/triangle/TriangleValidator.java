package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.is.valid.triangle;

//題目
/*
*Coding Exercise: Is Valid Triangle
You are given three integer inputs that represent the angles of a triangle. You need to complete a method named isValidTriangle(int angle1, int angle2, int angle3), inside a class named TriangleValidator. This method should return a boolean value – true if the given angles form a valid triangle, and false if they do not.

The conditions for a valid triangle are:

Each of the angles must be a positive integer.

The sum of all the three angles must be exactly 180.

Please complete the isValidTriangle method in the provided TriangleValidator class following the template:

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        return false;
    }
}

* Details

Ensure you return false if any of the input angles are non-positive (i.e., less than or equal to zero).

Compute the sum of the angles and check if it equals 180.

Return true if all conditions are met, false otherwise.

Good luck!
* */
//我寫的
public class TriangleValidator {

    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if((angle1 <= 0) ||(angle2 <= 0) || (angle3 <= 0)){
            return false;
        }
        int sum = angle1 + angle2 + angle3;
        if(sum == 180 ){
            return true;
        }else{
            return false;
        }



    }
}

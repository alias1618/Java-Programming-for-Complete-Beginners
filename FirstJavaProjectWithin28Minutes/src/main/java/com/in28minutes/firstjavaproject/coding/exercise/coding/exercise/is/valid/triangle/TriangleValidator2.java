package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.is.valid.triangle;


/* 解答
* The solution method isValidTriangle in the TriangleValidator class checks if the given angles form a valid triangle based on two conditions:

Each of the angles is a positive integer.

The sum of all the three angles is exactly 180.
*
* Code Explanation



The if condition checks whether any of the input angles are less than or equal to zero. If any angle is non-positive, the method returns false. This is because a valid triangle cannot have an angle of zero or a negative angle.

if(angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
    return false;
}
The sum of the three angles is calculated and stored in the sumOfAngles variable.

int sumOfAngles = angle1 + angle2 + angle3;
Finally, the method checks whether the sum of the angles is equal to 180. If the sum is 180, it means the angles form a valid triangle, and the method returns true. If the sum is not 180, the angles do not form a valid triangle, and the method returns false.

return sumOfAngles == 180;
This solution takes into account all edge cases and correctly determines whether the input angles form a valid triangle.
*
*
* */
//老師寫的
public class TriangleValidator2 {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {

        // check if any angle is non-positive
        if(angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            return false;
        }

        // calculate the sum of the angles
        int sumOfAngles = angle1 + angle2 + angle3;

        // if the sum is exactly 180, the angles form a valid triangle
        return sumOfAngles == 180;
    }
}

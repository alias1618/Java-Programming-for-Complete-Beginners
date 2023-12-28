package com.in28minutes.firstjavaproject.coding.exercise.coding.exercise.is.right.angled;

/*老師寫的
*
*
The problem is to check whether the triangle formed by the given side lengths is right-angled or not.

We are given a method isRightAngled(int side1, int side2, int side3) and we need to complete this method.

We can use the Pythagorean theorem to solve this problem. According to the theorem, in a right-angled triangle, the square of the length of the hypotenuse (the side opposite the right angle) is equal to the sum of the squares of the lengths of the other two sides.
*
* Here's how the solution works:

First, we check if any side length is non-positive. If so, we return false because it is not a valid triangle.

Then we apply the Pythagorean theorem to each combination of sides. If the theorem holds true for any combination, the triangle is right-angled, and we return true.

If none of the combinations satisfy the Pythagorean theorem, the triangle is not right-angled, and we return false.

This way, we can determine if the triangle is right-angled or not, based on the lengths of its sides.
*
* */

public class TriangleValidator2 {
    public boolean isRightAngled(int side1, int side2, int side3) {

        // check if any side length is non-positive
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // check each combination of sides to see if Pythagorean theorem holds
        if (side1 * side1 == side2 * side2 + side3 * side3) {
            return true;
        }

        if (side2 * side2 == side1 * side1 + side3 * side3) {
            return true;
        }

        if (side3 * side3 == side1 * side1 + side2 * side2) {
            return true;
        }

        // if none of the combinations hold, it's not a right-angled triangle
        return false;
    }
}

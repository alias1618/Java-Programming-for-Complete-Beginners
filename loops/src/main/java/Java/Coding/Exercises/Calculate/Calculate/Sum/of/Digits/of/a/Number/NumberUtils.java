package Java.Coding.Exercises.Calculate.Calculate.Sum.of.Digits.of.a.Number;

/*
* Examples with Code

Here are some examples of how your NumberUtils class should behave once the getSumOfDigits(int number) method is implemented:

NumberUtils utils = new NumberUtils();

System.out.println(utils.getSumOfDigits(123));   // Output: 6
System.out.println(utils.getSumOfDigits(90));    // Output: 9
System.out.println(utils.getSumOfDigits(5));     // Output: 5
System.out.println(utils.getSumOfDigits(0));     // Output: 0
System.out.println(utils.getSumOfDigits(-67));   // Output: -1
In the above examples, the sum of digits of each number is calculated as expected, and -1 is returned for negative inputs.

Note

The sum of digits of a number can be calculated by repeatedly removing the last digit from the number and adding it to the sum. For instance, the sum of digits of 123 can be calculated as follows:

The last digit of 123 is 3. Remove 3 from 123 to get 12. Add 3 to the sum.

The last digit of 12 is 2. Remove 2 from 12 to get 1. Add 2 to the sum.

The last digit of 1 is 1. Remove 1 from 1 to get 0. Add 1 to the sum.

Now that the number is 0, we stop. The sum of digits of 123 is 3 + 2 + 1 = 6.

Good luck with your implementation!
*
* */

/*
*Begin by handling the edge cases where the input number is either 0 or negative. If the number is 0, return 0. If the number is negative, return -1.

To calculate the sum of digits of a positive integer, you will need a loop that continues until the number becomes 0.

In each iteration of the loop, find the last digit of the number using the modulus operator %. The expression number % 10 gives the last digit of the number.

Add the last digit to the sum.

Remove the last digit from the number by dividing the number by 10. The expression number /= 10 removes the last digit from the number.

Continue this process until the number becomes 0.

Finally, return the sum of the digits.
*
* */
public class NumberUtils {
    public int getSumOfDigits(int number) {
        if(number == 0 ){
            return 0;
        }

        if(number < 0 ){
            return -1;
        }

        int digits = 0;
        while(number > 0){
            digits = digits + (number % 10);
            number = number / 10;

        }

        return digits;
    }
}

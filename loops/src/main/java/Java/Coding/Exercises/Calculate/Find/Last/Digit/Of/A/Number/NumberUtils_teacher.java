package Java.Coding.Exercises.Calculate.Find.Last.Digit.Of.A.Number;

public class NumberUtils_teacher {

    /**
     * This method takes an integer and returns its last digit.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 0.
     * @param number: an integer
     * @return last digit of number, or -1 if number is negative, or 0 if number is zero.
     */
    public int getLastDigit(int number) {
        // Edge case: when number is zero
        if (number == 0) {
            return 0;
        }
        // Edge case: when number is negative
        if (number < 0) {
            return -1;
        }

        // Obtain the last digit of the number using modulo operation
        int lastDigit = number % 10;

        return lastDigit;
    }
}

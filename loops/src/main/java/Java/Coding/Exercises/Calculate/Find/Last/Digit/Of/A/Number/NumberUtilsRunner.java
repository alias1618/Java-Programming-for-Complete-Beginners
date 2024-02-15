package Java.Coding.Exercises.Calculate.Find.Last.Digit.Of.A.Number;

public class NumberUtilsRunner {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

        System.out.println(utils.getLastDigit(1234));   // Output: 4
        System.out.println(utils.getLastDigit(90));     // Output: 0
        System.out.println(utils.getLastDigit(9));      // Output: 9
        System.out.println(utils.getLastDigit(0));      // Output: 0
        System.out.println(utils.getLastDigit(-67));    // Output: -1
    }
}

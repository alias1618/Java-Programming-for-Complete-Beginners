package Java.Coding.Exercises.Calculate.Reverse.a.Number;

public class NumberUtilsRunner {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

        System.out.println(utils.reverseNumber(123));

        System.out.println(utils.reverseNumber(5497));

        System.out.println(utils.reverseNumber(-456));

        System.out.println(utils.reverseNumber(0));
    }
}

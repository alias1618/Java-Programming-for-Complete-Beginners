package Java.Coding.Exercises.Calculate.Find.Last.Digit.Of.A.Number;

public class NumberUtils {
    public int getLastDigit(int number) {
        // Write your code here

        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 0;
        }

        return number % 10;
    }
}

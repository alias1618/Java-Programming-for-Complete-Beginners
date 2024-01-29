package Exercises.Overview.and.First.Exercise.Prime.Numbers;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);
        boolean isPrime = number.isPrime();
        System.out.println("isPrime " + isPrime);

        int sum = number.sumUptoN();
        System.out.println("sumUptoN " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors " + sumOfDivisors);

        number.printNumberTriangle();
        //System.out.println("printNumberTriangle " + printNumberTriangle);
    }
}

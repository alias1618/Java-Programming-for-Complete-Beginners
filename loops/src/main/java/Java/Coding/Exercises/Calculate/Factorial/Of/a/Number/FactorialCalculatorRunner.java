package Java.Coding.Exercises.Calculate.Factorial.Of.a.Number;

public class FactorialCalculatorRunner {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        System.out.println(calculator.calculateFactorial(5));

        System.out.println(calculator.calculateFactorial(4));

        System.out.println(calculator.calculateFactorial(3));

        System.out.println(calculator.calculateFactorial(2));

        System.out.println(calculator.calculateFactorial(1));

        System.out.println(calculator.calculateFactorial(0));

        System.out.println(calculator.calculateFactorial(-1));
    }

}

package Java.Coding.Exercises.Calculate.GCD.of.a.Number;

public class BiNumberRunner {
    public static void main(String[] args) {

        BiNumber binum = new BiNumber(48, 18);
        System.out.println(binum.calculateGCD()); // Output: 6

        binum = new BiNumber(0, 5);
        System.out.println(binum.calculateGCD()); // Output: 0

        binum = new BiNumber(-4, 2);
        System.out.println(binum.calculateGCD()); // Output: 1
    }
}

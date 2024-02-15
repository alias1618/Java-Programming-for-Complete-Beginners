package Java.Coding.Exercises.Calculate.Factorial.Of.a.Number;

public class FactorialCalculator {

    public int calculateFactorial(int number){
       int renumber = 1;
       if(number < 0){
           return -1;
       } else{
           for(int i = 1;i <= number; i++){
               renumber = renumber * i;
           }
           return renumber;
       }
    }
}

package com.in28minutes.primitive.datatypes.Java.Boolean.Data.Type;

public class BooleanDataRunner {
    public static void main(String[] args) {

        int i = 15;
        int j = 10;
        //不建議這種寫法
        System.out.println(j > 15 && i++ >5);
        System.out.println("j= "+ j + " i= " + i);

        System.out.println(j > 15 & i++ >5);
        System.out.println("j= "+ j + " i= " + i);

        //比較好的寫法
        System.out.println(i++);
        System.out.println(j > 15 & i >5);
        System.out.println("j= "+ j + " i= " + i);


        //同樣|| 和 | 也有相同問題
    }
}

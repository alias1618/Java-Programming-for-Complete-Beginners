package com.in28minutes.primitive.datatypes.Java.charData;

public class MyCharRunner {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('A');
        System.out.println(myChar.isVowel());
        //'a','e','i','o','u' and Capitals
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();

    }
}

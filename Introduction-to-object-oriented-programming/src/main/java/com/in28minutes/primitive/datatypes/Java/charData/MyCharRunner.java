package com.in28minutes.primitive.datatypes.Java.charData;

public class MyCharRunner {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('6');
        System.out.println(myChar.isVowel());
        //'a','e','i','o','u' and Capitals
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
//        MyChar.printLowerCaseAlphabets();
//        MyChar.printUpperCaseAlphabets();

    }
}

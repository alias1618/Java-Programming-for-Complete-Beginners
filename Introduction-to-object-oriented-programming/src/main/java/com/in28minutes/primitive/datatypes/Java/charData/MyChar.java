package com.in28minutes.primitive.datatypes.Java.charData;

public class MyChar {
    
    private char x;

    public MyChar(char x) {
        this.x = x;
    }

    public static void printLowerCaseAlphabets() {
    }

    public static void printUpperCaseAlphabets() {
    }

    public boolean isVowel() {
        //'a','e','i','o','u' and Capitals
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ){
            return true;
        }else if(x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            return true;
        }

        return false;
    }


    public boolean isAlphabet() {
        if(x >= 97 && x <= 122){     //between 'a' and 'z'
            return true;
        }
        if(x >= 65 && x <= 90){     //between 'A' and 'Z'
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if(x >= 48 && x <= 57){     //between '0' and '9'
            return true;
        }
        return false;
    }
}

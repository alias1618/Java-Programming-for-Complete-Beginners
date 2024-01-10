package com.in28minuttes.oops;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(50);
        Book effectiveJava = new Book(100);
        Book cleanCode = new Book(40);

        artOfComputerProgramming.setNoOfCopied(100);
        effectiveJava.setNoOfCopied(50);
        cleanCode.setNoOfCopied(45);
    }
}

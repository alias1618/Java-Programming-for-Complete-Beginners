package com.in28minuttes.oops;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.setNoOfCopied(100);
        effectiveJava.setNoOfCopied(50);
        cleanCode.setNoOfCopied(45);
    }
}

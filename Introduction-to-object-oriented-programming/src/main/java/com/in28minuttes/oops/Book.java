package com.in28minuttes.oops;

public class Book {
    private int noOfCopied;
    //noOfCopied

    //構造函數，當你創建構造函數，JAVA將不提供默認的構造函數
    public Book(int noOfCopied){
        this.noOfCopied = noOfCopied;
    }

    public void setNoOfCopied(int noOfCopied){
        if(noOfCopied > 0)
        this.noOfCopied = noOfCopied;
    }

    public void increaseNoOfCopies(int howMuch){
        setNoOfCopied(this.noOfCopied + howMuch);
    }

    public void descreaseNoOfCopies(int howMuch){
        setNoOfCopied(this.noOfCopied + howMuch);
    }
}

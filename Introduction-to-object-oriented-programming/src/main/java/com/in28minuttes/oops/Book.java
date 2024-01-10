package com.in28minuttes.oops;

public class Book {
    private int noOfCopied;
    //noOfCopied

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

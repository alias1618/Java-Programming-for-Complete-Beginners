package com.in28minuttes.oops.Java.Integer.Data.Types.step03;

public class BiNumber {
    private int x;
    private int y;

    public BiNumber(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getNumber1(){
        return this.x;
    }

    public int getNumber2(){
        return this.y;
    }

    public int add(){
        //this.x = x;
        return this.x + this.y;
    }

    public int multiply(){
        return this.x * this.y;
    }

    public void doublenumber(){
        this.x = this.x * 2;
        this.y = this.y * 2;
    }
}

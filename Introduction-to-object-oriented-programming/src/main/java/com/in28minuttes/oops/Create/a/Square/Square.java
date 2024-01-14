package com.in28minuttes.oops.Create.a.Square;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if (this.side <= 0) { // if side is non-positive, return -1
            return -1;
        }
        return side * side;
    }

    public int calculatePerimeter() {
        if (this.side <= 0) { // if side is non-positive, return -1
            return -1;
        }
        return 4 * side;
    }
}

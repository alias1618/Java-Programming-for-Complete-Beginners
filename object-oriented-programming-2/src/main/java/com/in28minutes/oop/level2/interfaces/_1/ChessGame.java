package com.in28minutes.oop.level2.interfaces._1;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {
        System.out.println("Move piece left");
    }

    @Override
    public void right() {
        System.out.println("Move piece right");
    }
}

package com.in28minutes.oop.level2.interfaces._1;

public class GameRunner {
    public static void main(String[] args) {
        //MarioGame game = new MarioGame();
        GamingConsole game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }

}

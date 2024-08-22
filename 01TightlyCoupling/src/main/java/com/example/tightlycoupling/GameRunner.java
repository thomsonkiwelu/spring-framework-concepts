package com.example.tightlycoupling;

public class GameRunner {

   // private MarioGame game;
    private MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game: "+ game.getClass());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

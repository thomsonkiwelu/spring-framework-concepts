package com.example.loosecoupling.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class GameRunner {

   // private MarioGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game){
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

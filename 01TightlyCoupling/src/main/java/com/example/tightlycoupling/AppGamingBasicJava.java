package com.example.tightlycoupling;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var superContractGame = new SuperContractGame();

        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}

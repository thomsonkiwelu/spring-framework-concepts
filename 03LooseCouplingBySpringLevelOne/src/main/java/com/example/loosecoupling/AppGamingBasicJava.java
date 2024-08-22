package com.example.loosecoupling;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var superContractGame = new SuperContractGame();
        var pacManGame = new PacManGame();

        GameRunner gameRunner = new GameRunner(superContractGame);
        gameRunner.run();
    }
}

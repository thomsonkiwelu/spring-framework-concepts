package com.example.loosecoupling;

public class AppGamingBasicJava {
    public static void main(String[] args){

        MarioGame marioGame = new MarioGame();
        SuperContractGame superContractGame = new SuperContractGame();
        PacManGame pacManGame = new PacManGame();

        GameRunner gameRunner = new GameRunner(superContractGame);
        gameRunner.run();
    }
}

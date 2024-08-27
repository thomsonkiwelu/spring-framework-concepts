package com.example.loosecoupling.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Go up");
    }

    public void down(){
        System.out.println("Go Down");
    }

    public  void left(){
        System.out.println("Move forward");
    }

    public  void right(){
        System.out.println("Move back");
    }
}


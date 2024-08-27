package com.example.loosecoupling;

import com.example.loosecoupling.game.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXmlConfigurationContext {

    public static void main(String[] args){

        try(var context = new ClassPathXmlApplicationContext("application.context.xml")){

            context.getBean(GameRunner.class).run();
        }
    }
}

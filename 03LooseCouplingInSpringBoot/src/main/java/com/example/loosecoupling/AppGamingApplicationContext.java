package com.example.loosecoupling;

import com.example.loosecoupling.game.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.loosecoupling.*")
public class AppGamingApplicationContext {

    public static void main(String[] args){

        try(var context = new AnnotationConfigApplicationContext(AppGamingApplicationContext.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

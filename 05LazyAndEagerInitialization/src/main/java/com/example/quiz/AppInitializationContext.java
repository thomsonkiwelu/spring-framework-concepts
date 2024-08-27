package com.example.quiz;

import com.example.quiz.databasesource.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AppInitializationContext {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(AppInitializationContext.class)){

            // If you comment these statement postgres data source will not be initialized
            context.getBean(PostgresDataSource.class).findMax();
        }
    }
}

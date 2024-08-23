package com.example.quiz;

import com.example.quiz.databasesource.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.*;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AppQuizContext {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(AppQuizContext.class)){
            System.out.println(context.getBean(BusinessDatabaseSource.class).findMax());
        }
    }
}

package com.example.quiz.databasesource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MysqlDataSource {

    public MysqlDataSource(){
        System.out.println("Msql data source is eagerly initialized successfully");
    }

}


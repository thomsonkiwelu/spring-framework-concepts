package com.example.quiz.databasesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessDatabaseSource {
    @Autowired
    public  DataService dataService;

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}

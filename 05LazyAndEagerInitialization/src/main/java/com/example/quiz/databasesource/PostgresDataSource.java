package com.example.quiz.databasesource;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
//@Lazy
@Lazy(value = true)
public class PostgresDataSource {

    public PostgresDataSource(){
        System.out.println("Postgres data source is lazy initialized successfully");
    }

    public void findMax() {

        int [] scores = new int[] { 34, 56, 89, 90, 30 };
        System.out.println("Maximum number is " + Arrays.stream(scores).max().orElse(0));

    }
}


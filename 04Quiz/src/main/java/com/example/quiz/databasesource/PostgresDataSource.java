package com.example.quiz.databasesource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresDataSource implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 23, 55, 90, 70, 90, 204 };
    }
}


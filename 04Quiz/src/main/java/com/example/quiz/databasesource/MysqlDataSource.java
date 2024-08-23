package com.example.quiz.databasesource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MysqlDataSource implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 34, 56, 89, 90, 30 };
    }
}


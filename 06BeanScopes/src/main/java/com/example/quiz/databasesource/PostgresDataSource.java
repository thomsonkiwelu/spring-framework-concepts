package com.example.quiz.databasesource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) oR
@Scope(value = "prototype")
public class PostgresDataSource {

}


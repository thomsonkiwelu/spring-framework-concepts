package com.example.quiz;

import com.example.quiz.databasesource.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AppBeanScopeContext {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(AppBeanScopeContext.class)){

            System.out.println("Singleton scope");
            System.out.println(context.getBean(MysqlDataSource.class));
            System.out.println(context.getBean(MysqlDataSource.class));
            System.out.println(context.getBean(MysqlDataSource.class));
            System.out.println(context.getBean(MysqlDataSource.class));

            System.out.println();
            System.out.println("Prototype scope");
            System.out.println(context.getBean(PostgresDataSource.class));
            System.out.println(context.getBean(PostgresDataSource.class));
            System.out.println(context.getBean(PostgresDataSource.class));
            System.out.println(context.getBean(PostgresDataSource.class));
            System.out.println(context.getBean(PostgresDataSource.class));

        }
    }
}

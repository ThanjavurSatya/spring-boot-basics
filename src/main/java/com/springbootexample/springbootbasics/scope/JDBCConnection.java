package com.springbootexample.springbootbasics.scope;

import org.springframework.stereotype.Component;

@Component
public class JDBCConnection {
    JDBCConnection(){
        System.out.println("JDBC Connection!");
    }
}

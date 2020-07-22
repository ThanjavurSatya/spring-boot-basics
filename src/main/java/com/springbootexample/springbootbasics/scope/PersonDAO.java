package com.springbootexample.springbootbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    @Autowired
    JDBCConnection jdbcConnection;
    void getPersonDAO()
    {
        System.out.println("GetPersonDAO method invoked!");
    }
}
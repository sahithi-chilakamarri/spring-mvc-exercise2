package com.stackroute.exercise2;

import org.springframework.stereotype.Component;

@Component
public class User {
     private String username;
     private String password;
     //Parameterized constructor
    public User(String name,String password) {
        this.username = name;
        this.password=password;
    }
     //Default constructor
    public User() {
    }
     //Getter and setter methods for the members of the class
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

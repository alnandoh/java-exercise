package com.adepuu.exercises.session8;

import java.util.UUID;

//This class represents a user entity with attributes such as username, password, and a unique ID generated using UUID.
public class User {
    private final String userID;
    private String username;
    private String password;
    public  User(String username,String password){
        UUID uuid = UUID.randomUUID();
        this.userID = uuid.toString();
        this.username = username;
        this.password= password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}

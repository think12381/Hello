package com.example.HelloWorld.Service;

public class User {

    private String username;
    private String password;

    public User(String username,String password){

        this.username = username;
        this.password = password;
    }

    @Override
    public String toString(){
        String message = String.format("user[%s %s]",username,password);
        return message;
    }
}

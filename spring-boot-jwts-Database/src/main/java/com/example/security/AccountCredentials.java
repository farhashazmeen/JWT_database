package com.example.security;

//<--- AccountCredentials class for user details when POST call is made to login method  --->
public class AccountCredentials {

    private String username;
    private String password;
//<--- getters and setters method --->
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

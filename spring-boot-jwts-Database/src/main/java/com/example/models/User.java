package com.example.models;

import org.springframework.data.annotation.Id;

//<-----Java class that holds User collection(table) in Mongo data base---->
public class User{
    //<---_id is the primary key identifier--->
    @Id
    public Integer _id;
    public String name;
    public String account;
    //<----Constructor for User  class--->
    public User(Integer _id, String name, String account) {
        this._id = _id;
        this.name = name;
        this.account = account;
    }
    public User(){

    }
    //<--Getters and Setters for User Object-->
    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

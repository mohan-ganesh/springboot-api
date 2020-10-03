package com.example.user.demo.pojo;

/**
 *
 */

public class User {

    String name;
    String email;

    public String getPrintme() {
        return printme;
    }

    public void setPrintme(String printme) {
        this.printme = printme;
    }

    String printme;

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


}

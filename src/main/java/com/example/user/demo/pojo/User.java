package com.example.user.demo.pojo;

/**
 *
 */

public class User {

    String name;
    String email;

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    String threadName;

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    long threadId;


    public String getPrintme() {
        return printme;
    }

    public void setPrintme(String printme) {
        this.printme = printme;
    }

    String printme;

    public String getControllerRef() {
        return controllerRef;
    }

    public void setControllerRef(String controllerRef) {
        this.controllerRef = controllerRef;
    }

    String controllerRef;

    public String getApiRef() {
        return apiRef;
    }

    public void setApiRef(String apiRef) {
        this.apiRef = apiRef;
    }

    String apiRef;

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

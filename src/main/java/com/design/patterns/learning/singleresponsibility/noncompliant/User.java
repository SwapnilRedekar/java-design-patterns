package com.design.patterns.learning.singleresponsibility.noncompliant;

public class User {
    private String name;
    private String email;

    protected User() {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    
}

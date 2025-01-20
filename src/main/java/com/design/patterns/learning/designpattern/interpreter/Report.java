package com.design.patterns.learning.designpattern.interpreter;

public class Report {

    private String name;

    private String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return this.name;
    }

    public String getPermission() {
        return this.permission;
    }

}

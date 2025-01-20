package com.design.patterns.learning.designpattern.interpreter;

import java.util.List;
import java.util.stream.Stream;

public class User {

    private String name;

    private List<String> permissions;

    public User(String name, String... permissions) {
        this.name = name;
        this.permissions = Stream.of(permissions)
        .map(String::toLowerCase)
        .toList();
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }
    
}

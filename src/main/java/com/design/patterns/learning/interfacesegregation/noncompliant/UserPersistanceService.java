package com.design.patterns.learning.interfacesegregation.noncompliant;

import java.util.ArrayList;
import java.util.List;

public class UserPersistanceService implements PersistanceService<User> {

    private static final List<User> USERS = new ArrayList<>();

    @Override
    public void save(User user) {
        USERS.add(user);
    }

    @Override
    public void delete(User user) {
        USERS.remove(user);
    }

    @Override
    public User findById(long id) {
        return USERS.stream()
        .filter(user -> user.getId() == id)
        .findFirst()
        .orElse(null);
    }

    @Override
    public User findByName(String name) {
        return USERS.stream()
        .filter(user -> user.getName().equals(name))
        .findFirst()
        .orElse(null);
    }

}

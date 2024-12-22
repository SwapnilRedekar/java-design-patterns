package com.design.patterns.learning.singleresponsibility.noncompliant;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        users.add(user);
    }

}

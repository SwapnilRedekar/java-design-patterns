package com.design.patterns.learning.singleresponsibility.compliant;

public class UserController {

    UserService userService = new UserService();

    public void createUser(String name, String email) {
        if (UserValidator.isValidUser(name, email)) {
            User user = new User(name, email);
            userService.saveUser(user);
        }
    }

}

package com.design.patterns.learning.singleresponsibility.noncompliant;

public class UserController {

    UserService UserService = new UserService();

    public void createUser(String name, String email) {
        if (isValidUser(name, email)) {
            User user = new User(name, email);
            UserService.saveUser(user);    
        }
        
    }

    /*
     * This method is not compliant with the Single Responsibility Principle.
     * We need to create a new class to handle the validation of the user.
     */
    private boolean isValidUser(String name, String email) {
        return name != null && email != null;
    }



}

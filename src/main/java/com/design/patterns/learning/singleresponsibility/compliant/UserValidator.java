package com.design.patterns.learning.singleresponsibility.compliant;

/*
 * This class is handling the validation of the user. 
 * This is making UserController class compliant with the Single Responsibility Principle.
 */
public class UserValidator {

    public static boolean isValidUser(String name, String email) {
        return name != null && email != null;
    }

}

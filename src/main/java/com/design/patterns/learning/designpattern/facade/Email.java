package com.design.patterns.learning.designpattern.facade;

public class Email {

    public static EmailBuilder getEmailBuilder() {
        return new EmailBuilder();
    }

}

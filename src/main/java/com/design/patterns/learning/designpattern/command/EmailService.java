package com.design.patterns.learning.designpattern.command;

public class EmailService {

    public void addMember(String email, String mailList) {
        System.out.println("New member with email address : " 
        + email + " has been added to " + mailList);
    }

    public void removeMember(String email, String mailList) {
        System.out.println("Existing member with email " 
        + email + " has been removed from " + mailList);
    }
}

package com.design.patterns.learning.designpattern.command;

public class AddMemberCommand implements Command {

    private String email;

    private String mailList;

    private EmailService emailService;

    public AddMemberCommand(String email, String mailList, EmailService emailService) {
        this.email = email;
        this.mailList = mailList;
        this.emailService = emailService;
    }

    @Override
    public void execute() {
        emailService.addMember(email, mailList);
    }
}

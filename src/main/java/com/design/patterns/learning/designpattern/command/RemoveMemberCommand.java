package com.design.patterns.learning.designpattern.command;

public class RemoveMemberCommand implements Command {

    private String email;

    private String mailList;

    private EmailService emailService;

    public RemoveMemberCommand(String email, String mailList, EmailService emailService) {
        this.email = email;
        this.mailList = mailList;
        this.emailService = emailService;
    }

    @Override
    public void execute() {
        emailService.removeMember(email, mailList);
    }

    

}

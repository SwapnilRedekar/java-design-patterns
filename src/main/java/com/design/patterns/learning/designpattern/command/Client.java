package com.design.patterns.learning.designpattern.command;

public class Client {

    public static void main(String[] args) throws InterruptedException{
        EmailService emailService = new EmailService();
        Command addCommand = new AddMemberCommand("s12@gmail.com", "JobSearch", emailService);

        Command removeCommand = new RemoveMemberCommand("Z12z@gmail.com", "NewsLetter", emailService);

        MailTaskRunner runner = MailTaskRunner.getInstance();

        runner.addCommand(addCommand);
        runner.addCommand(removeCommand);

        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();
    }

}

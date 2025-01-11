package com.design.patterns.learning.designpattern.facade;

public class Mailer {

    private Mailer() {

    }

    private static final Mailer MAILER = new Mailer();

    public static Mailer getMailer() {
        return MAILER;
    }

    public boolean sendMail(Email email) {
        return true;
    }


}

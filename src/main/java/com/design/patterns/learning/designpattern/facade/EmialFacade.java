package com.design.patterns.learning.designpattern.facade;

import com.design.patterns.learning.designpattern.facade.Template.TemplateType;

public class EmialFacade {

    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplate(TemplateType.EMAIL);
        Stationary stationary = StationaryFactory.createStationary();

        Email email = Email.getEmailBuilder()
                           .withTemplate(template)
                           .withStationary(stationary)
                           .withObject(order)
                           .build();

        Mailer mailer = Mailer.getMailer();
        return mailer.sendMail(email);
    }

}

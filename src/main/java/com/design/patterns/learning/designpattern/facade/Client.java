package com.design.patterns.learning.designpattern.facade;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("1", 1001);
        EmialFacade emialFacade = new EmialFacade();
        boolean isSent = emialFacade.sendOrderEmail(order);

        System.out.println("Order email is " + (isSent ? "sent" : "not sent"));
    }

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}


}

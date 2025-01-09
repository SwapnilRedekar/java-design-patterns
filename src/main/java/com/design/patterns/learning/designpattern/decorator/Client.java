package com.design.patterns.learning.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("May the <force> be with you!");
        System.out.println(message.readMessage());

        Message htmlDecorator = new HTMLEncodedMessage(message);
        System.out.println(htmlDecorator.readMessage());

        Message base64Decorator = new Base64EncodedMessage(message);
        System.out.println(base64Decorator.readMessage());
    }

}

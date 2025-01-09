package com.design.patterns.learning.designpattern.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {

    private Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String readMessage() {
        return Base64.getEncoder().encodeToString(message.readMessage().getBytes());
    }


}

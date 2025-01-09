package com.design.patterns.learning.designpattern.decorator;

public class TextMessage implements Message {

    private String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String readMessage() {
        return message;
    }

   

}

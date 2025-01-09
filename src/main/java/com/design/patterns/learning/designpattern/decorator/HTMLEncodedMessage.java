package com.design.patterns.learning.designpattern.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HTMLEncodedMessage implements Message{

    private Message message;

    public HTMLEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String readMessage() {
        return StringEscapeUtils.escapeHtml4(message.readMessage());
    }



}

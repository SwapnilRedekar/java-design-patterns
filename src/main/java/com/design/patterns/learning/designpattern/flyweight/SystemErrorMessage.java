package com.design.patterns.learning.designpattern.flyweight;

public class SystemErrorMessage implements ErrorMessage {

    private String messageTemplate;

    private String helpBaseUrl;

    public SystemErrorMessage(String messageTemplate, String helpBaseUrl) {
        this.messageTemplate = messageTemplate;
        this.helpBaseUrl = helpBaseUrl;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpBaseUrl + code;
    }

}

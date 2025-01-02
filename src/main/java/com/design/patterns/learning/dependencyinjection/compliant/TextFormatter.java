package com.design.patterns.learning.dependencyinjection.compliant;

public class TextFormatter implements Formatter {
    
    @Override
    public String format(Message message) throws FormatException {
        return message.getTimestamp() + message.getMessage();
    }

}

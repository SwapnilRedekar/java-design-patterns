package com.design.patterns.learning.dependencyinjection.compliant;

import java.time.LocalDateTime;

public class Message {

    private String message;

    private LocalDateTime timestamp;

    public Message(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }   
}

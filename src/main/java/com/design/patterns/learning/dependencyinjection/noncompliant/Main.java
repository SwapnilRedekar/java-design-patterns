package com.design.patterns.learning.dependencyinjection.noncompliant;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws IOException {
        Message message = new Message("BJP won Delhi assembly election", LocalDateTime.of(2025, 3, 20, 12, 30, 0, 0));
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage(message, "message.txt");
    }

}

package com.design.patterns.learning.dependencyinjection.compliant;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("BJP won Delhi assembly elections", LocalDateTime.of(2025, 3, 20, 13, 10, 0, 0));
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("message.txt"))) {
            Formatter formatter = new JSONFormatter();
            MessagePrinter messagePrinter = new MessagePrinter();
            messagePrinter.writeMessage(message, formatter, printWriter);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

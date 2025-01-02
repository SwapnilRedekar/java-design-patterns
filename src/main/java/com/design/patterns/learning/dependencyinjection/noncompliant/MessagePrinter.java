package com.design.patterns.learning.dependencyinjection.noncompliant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    /*
     * This method is tightly coupled with the JSONFormatter class. 
     * If we want to use a different formatter, we need to modify this class.
     * This is a violation of the Dependency Inversion Principle.
     */
    public void printMessage(Message message, String fileName) throws IOException{
         Formatter formatter = new JSONFormatter();
         try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            printWriter.println(formatter.format(message));
            printWriter.flush();
         } catch (FormatException e) {
            e.printStackTrace();
         }
    }
}
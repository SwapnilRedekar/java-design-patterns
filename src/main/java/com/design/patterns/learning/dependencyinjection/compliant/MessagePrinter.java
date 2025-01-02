package com.design.patterns.learning.dependencyinjection.compliant;

import java.io.PrintWriter;

public class MessagePrinter {

    /*
     * This is method is loosely coupled with the Formatter interface.
     * We can use any Formatter implementation without modifying this class.
     * This is compliant with the dependency inversion principle.
     */
    public void writeMessage(Message message, Formatter formatter, PrintWriter printWriter) throws FormatException {
                printWriter.println(formatter.format(message));
                printWriter.flush();
    }

}

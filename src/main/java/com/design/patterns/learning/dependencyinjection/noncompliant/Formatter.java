package com.design.patterns.learning.dependencyinjection.noncompliant;

public interface Formatter {
    
    String format(Message message) throws FormatException;
}

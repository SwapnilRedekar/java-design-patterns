package com.design.patterns.learning.dependencyinjection.noncompliant;

public class FormatException extends Exception{

    public FormatException(Exception e) {
        super(e);
    }
}
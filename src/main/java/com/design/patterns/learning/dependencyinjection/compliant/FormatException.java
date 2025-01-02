package com.design.patterns.learning.dependencyinjection.compliant;

public class FormatException extends Exception{

    public FormatException(Exception e) {
        super(e);
    }

}

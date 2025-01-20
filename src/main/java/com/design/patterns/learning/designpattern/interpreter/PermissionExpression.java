package com.design.patterns.learning.designpattern.interpreter;

public interface PermissionExpression {

    boolean interpret(User user);
}

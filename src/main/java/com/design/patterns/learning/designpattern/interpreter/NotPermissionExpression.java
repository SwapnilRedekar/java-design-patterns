package com.design.patterns.learning.designpattern.interpreter;

public class NotPermissionExpression implements PermissionExpression {

    private PermissionExpression permissionExpression;

    public NotPermissionExpression(PermissionExpression permissionExpression) {
        this.permissionExpression = permissionExpression;
    }

    @Override
    public boolean interpret(User user) {
        return !permissionExpression.interpret(user);
    }

    @Override
    public String toString() {
        return "NOT " + permissionExpression ;
    }
    
}

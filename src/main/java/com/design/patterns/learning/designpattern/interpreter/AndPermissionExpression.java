package com.design.patterns.learning.designpattern.interpreter;

public class AndPermissionExpression implements PermissionExpression {

    private PermissionExpression permissionExpressionOne;
    private PermissionExpression permissionExpressionTwo;

    public AndPermissionExpression(PermissionExpression permissionExpressionOne, PermissionExpression permissionExpressionTwo) {
        this.permissionExpressionOne = permissionExpressionOne;
        this.permissionExpressionTwo = permissionExpressionTwo;
    }

    @Override
    public boolean interpret(User user) {
        return permissionExpressionOne.interpret(user) && permissionExpressionTwo.interpret(user);
    }

    @Override
    public String toString() {
        return permissionExpressionOne + " AND " + permissionExpressionTwo;
    }


}

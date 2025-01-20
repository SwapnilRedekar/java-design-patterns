package com.design.patterns.learning.designpattern.interpreter;

public class Client {

    public static void main(String[] args) {
        Report annualReport = new Report("Annual Report", "CABINET_SECRETARY OR FINANCE_SECRETARY");
        ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        PermissionExpression permissionExpression = expressionBuilder.build(annualReport);
        System.out.println(permissionExpression);
        User user = new User("Raghav", "ADMIN");
        System.out.println("Can " + user.getName() + " access " + 
        annualReport.getName() + " ? " + permissionExpression.interpret(user));
    }

}

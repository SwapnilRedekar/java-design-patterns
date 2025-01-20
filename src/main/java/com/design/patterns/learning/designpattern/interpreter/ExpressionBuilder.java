package com.design.patterns.learning.designpattern.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

public class ExpressionBuilder {

    private Stack<PermissionExpression> permissionExpressions = new Stack<>();

    private Stack<String> operators = new Stack<>();

    public PermissionExpression build(Report report) {
         parse(report.getPermission());
         buildExpression();
         if (permissionExpressions.size() > 1 || !operators.isEmpty()) {
            System.out.println("Error!!!!");
         }
         return permissionExpressions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission.toLowerCase());
        while (tokenizer.hasMoreTokens()) {
            String token;
            switch (token = tokenizer.nextToken()) {
                case "and":
                    operators.push("and");
                    break;
                case "or":
                    operators.push("or");
                    break;
                case "not":
                    operators.push("not");
                    break;
                default:
                    permissionExpressions.push(new Permission(token));//
                    break;
            }
        }
    }

    private void buildExpression() {
        while (!operators.isEmpty()) {
			String operator = operators.pop();
			PermissionExpression permissionExpressionOne;
			PermissionExpression permissionExpressionTwo;
			PermissionExpression permissionExpression;
			switch (operator) {
			case "not":
				permissionExpressionOne = permissionExpressions.pop();
				permissionExpression = new NotPermissionExpression(permissionExpressionOne);
				break;
			case "and":
				permissionExpressionOne = permissionExpressions.pop();
				permissionExpressionTwo = permissionExpressions.pop();
				permissionExpression = new AndPermissionExpression(permissionExpressionOne, permissionExpressionTwo);
				break;
			case "or":
				permissionExpressionOne = permissionExpressions.pop();
				permissionExpressionTwo = permissionExpressions.pop();
				permissionExpression = new OrPermissionExpression(permissionExpressionOne, permissionExpressionTwo);
				break;
			default:
				throw new IllegalArgumentException("Unknown operator:" + operator);
			}
			permissionExpressions.push(permissionExpression);
		}
    }
    
}

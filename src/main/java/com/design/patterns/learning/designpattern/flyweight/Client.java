package com.design.patterns.learning.designpattern.flyweight;

import com.design.patterns.learning.designpattern.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

    public static void main(String[] args) {
        SystemErrorMessage messageOne = ErrorMessageFactory.getInstance()
                                          .getError(ErrorType.GenericSystemError);
        System.out.println(messageOne.getText("403"));                                          
    }
}

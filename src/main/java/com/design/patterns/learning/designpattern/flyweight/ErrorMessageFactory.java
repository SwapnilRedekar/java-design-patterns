package com.design.patterns.learning.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    public static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {

        errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage(
            "A generic error of type $errorCode has occurred. Please refer to \n",
             "http://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage(
            "Page not Foud. An error of type $errorCode has occurred. Please refer to \n",
             "http://google.com/q="));

        
    }

    public SystemErrorMessage getError(ErrorType errorType) {
        return errorMessages.get(errorType);
    }

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    public UserBannedErrorMessage getUserBannedErrorMessage(String userId) {
         return new UserBannedErrorMessage(userId);
    }
}
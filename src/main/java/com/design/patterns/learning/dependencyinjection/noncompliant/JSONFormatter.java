package com.design.patterns.learning.dependencyinjection.noncompliant;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFormatter implements Formatter {

    @Override
    public String format(Message message) throws FormatException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(message);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            throw new FormatException(e);
        }
    }

}

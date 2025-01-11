package com.design.patterns.learning.designpattern.facade;

public class TemplateFactory {

    private TemplateFactory () {
        
    }

    public static Template createTemplate(Template.TemplateType type) {
        return switch(type) {
            case EMAIL -> new OrderEmailTemplate();
            default -> throw new IllegalArgumentException("Unknown Template Type");
        };
    }

}

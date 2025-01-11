package com.design.patterns.learning.designpattern.facade;

public abstract class Template {

    public enum TemplateType { EMAIL, NEWSLETTER}

    public abstract String format(Object object);

}

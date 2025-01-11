package com.design.patterns.learning.designpattern.facade;

public class EmailBuilder {

    public EmailBuilder withTemplate(Template template) {
        return this;
    }

    public EmailBuilder withStationary(Stationary stationary) {
        return this;
    }

    public EmailBuilder withObject(Object object) {
        return this;
    }

    public Email build() {
        return null;
    }

    public Email getEmail() {
        return null;
    }

}

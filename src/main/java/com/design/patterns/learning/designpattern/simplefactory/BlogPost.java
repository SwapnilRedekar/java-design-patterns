package com.design.patterns.learning.designpattern.simplefactory;

public class BlogPost extends Post {

    private String author;

    private String[] references;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getReferences() {
        return references;
    }

    public void setReferences(String[] references) {
        this.references = references;
    }

}

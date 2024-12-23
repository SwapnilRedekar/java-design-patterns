package com.design.patterns.learning.liskovsubstitution.noncompliant;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        super(size, size);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

}

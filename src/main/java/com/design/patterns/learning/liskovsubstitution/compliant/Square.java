package com.design.patterns.learning.liskovsubstitution.compliant;

public class Square implements Shape {

    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

}

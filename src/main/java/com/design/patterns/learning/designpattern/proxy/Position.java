package com.design.patterns.learning.designpattern.proxy;

public class Position {

    private int x;
    private int y;

    protected Position() {

    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    } 

    @Override
    public String toString() {
        return " x : " + this.x + " " + "y: " + this.y;
    } 

}

package com.design.patterns.learning.designpattern.objectpool;

public class Position {

    private int x;
    private int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position of(int x, int y) {
        return new Position(x, y);
    }

}

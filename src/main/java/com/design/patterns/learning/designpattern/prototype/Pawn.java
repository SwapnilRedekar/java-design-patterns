package com.design.patterns.learning.designpattern.prototype;

public class Pawn extends Chessman{

    public Pawn() {
        super();
    }

    @Override
    protected void initiaize(String x, String y) {
        super.position = new Position(x, y);
    }

}

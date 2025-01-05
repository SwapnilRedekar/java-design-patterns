package com.design.patterns.learning.designpattern.prototype;

public class King extends Chessman{

    public King() {
        super();
    }

    @Override
    protected void initiaize(String x, String y) {
        this.position = new Position(x, y);
    }

    @Override
    public Chessman clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("King is unique.");
    }

}

package com.design.patterns.learning.designpattern.prototype;

public abstract class Chessman implements Cloneable {

    protected Position position;

    protected Chessman() {

    }

    public void move(String x, String y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public Chessman clone() throws CloneNotSupportedException {
         Chessman chessman = (Chessman) super.clone();
         chessman.initiaize("A", "1");
         return chessman;
    }

    protected abstract void initiaize(String x, String y);

    public String toString() {
        return position.toString();
    }

}

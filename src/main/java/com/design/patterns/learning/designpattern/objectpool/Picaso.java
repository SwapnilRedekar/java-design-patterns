package com.design.patterns.learning.designpattern.objectpool;

public class Picaso implements Image {

    private Position position;

    private String name;

    public Picaso(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        position = null;
        System.out.println("Picaso is reset.");
    }

    @Override
    public void draw() {
        System.out.println("Imaginations on the images");
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

}

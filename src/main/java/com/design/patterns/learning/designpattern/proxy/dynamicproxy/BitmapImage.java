package com.design.patterns.learning.designpattern.proxy.dynamicproxy;

import com.design.patterns.learning.designpattern.proxy.Position;

public class BitmapImage implements Image{

    private String filename;
    private Position position;

    public BitmapImage(String filename) {
         System.out.println("Loaded from disk " + filename);
         this.filename = filename;    
    }

    @Override
    public void setPosition(Position position) {
       this.position = position;    
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void render() {
        System.out.println("Rendered "  + this.filename);
    }

}

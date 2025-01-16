package com.design.patterns.learning.designpattern.proxy.staticproxy;

import com.design.patterns.learning.designpattern.proxy.Position;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.createImage("proxy.jpg");
        image.setPosition(new Position(11, 11));
        System.out.println("Image position is " + image.getPosition());
        System.out.println("Rendering real image.....");
        image.render();
        
    }

}

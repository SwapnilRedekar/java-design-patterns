package com.design.patterns.learning.designpattern.proxy.dynamicproxy;

import com.design.patterns.learning.designpattern.proxy.Position;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.createImage("Abc.jpg");
        image.setPosition(new Position(-11, -100));
        System.out.println(image.getPosition());
        System.out.println("-------------------------");
        System.out.println("Rendering actual image");
        image.render();
    }

}

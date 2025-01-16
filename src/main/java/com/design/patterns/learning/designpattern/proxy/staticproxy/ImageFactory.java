package com.design.patterns.learning.designpattern.proxy.staticproxy;

public class ImageFactory {

    public static Image createImage(String filename) {
        return new ImageProxy(filename);
    }
}

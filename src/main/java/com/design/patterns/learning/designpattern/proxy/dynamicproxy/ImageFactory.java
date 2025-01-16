package com.design.patterns.learning.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image createImage(String filename) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), 
        new Class[]{Image.class}, new ImageInvocationHandler(filename));
    }
}

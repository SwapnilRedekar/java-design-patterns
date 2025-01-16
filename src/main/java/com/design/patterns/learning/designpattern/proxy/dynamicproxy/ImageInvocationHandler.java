package com.design.patterns.learning.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.design.patterns.learning.designpattern.proxy.Position;

public class ImageInvocationHandler implements InvocationHandler {

    private String filename;
    private Position position;
    private BitmapImage bitmapImage;
    private static final Method setPositionMethod;
    private static final Method getPositionMethod;
    private static final Method renderMethod;

    static {
        Method tempSetPositionMethod = null;
        Method tempGetPositionMethod = null;
        Method tempRenderMethod = null;
        try {
            tempSetPositionMethod = Image.class.getMethod("setPosition", Position.class);
            tempGetPositionMethod = Image.class.getMethod("getPosition", (Class<?>[]) null);
            tempRenderMethod = Image.class.getMethod("render", (Class<?>[]) null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        setPositionMethod = tempSetPositionMethod;
        getPositionMethod = tempGetPositionMethod;
        renderMethod = tempRenderMethod;
    }

    public ImageInvocationHandler(String filename) {
        this.filename = filename;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method " + method.getName());   
        
        if (method.equals(setPositionMethod)) {
            return handleSetPosition(args);
        } else if (method.equals(getPositionMethod)) {
            return handleGetPosition();
        } else if (method.equals(renderMethod)) {
            return handleRender();
        } else {
            return null;
        }
    }

    private Position handleSetPosition(Object[] args) {
        if (bitmapImage == null) {
            this.position = (Position) args[0];
        } else {
            bitmapImage.setPosition((Position) args[0]);
        }
        return null;
    }

    private Position handleGetPosition() {
        if (bitmapImage == null) {
           return this.position;
        } else {
            return bitmapImage.getPosition();
        }
    }

    private Object handleRender() {
        if (bitmapImage == null) {
            this.bitmapImage = new BitmapImage(filename);
            if (position != null) 
              this.bitmapImage.setPosition(position);
        } 
        this.bitmapImage.render();
        return null;
    }

}

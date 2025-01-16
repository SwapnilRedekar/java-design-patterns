package com.design.patterns.learning.designpattern.proxy.staticproxy;

import com.design.patterns.learning.designpattern.proxy.Position;

public class ImageProxy implements Image {

    private String filename;
    private Position position;
    private BitmapImage bitmapImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void setPosition(Position position) {
        if (bitmapImage == null) {
           this.position = position;
        } else {
            bitmapImage.setPosition(position);
        }
    }

    @Override
    public Position getPosition() {
        if (bitmapImage == null) {
            return this.position;
        } else {
            return bitmapImage.getPosition();
        }
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
           bitmapImage = new BitmapImage(filename);
           bitmapImage.setPosition(position);
        } else {
            bitmapImage.render();
        }
    }

}

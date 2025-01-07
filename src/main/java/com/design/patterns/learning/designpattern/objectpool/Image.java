package com.design.patterns.learning.designpattern.objectpool;

public interface Image extends Poolable {

    void draw();

    void setPosition(Position position);

    Position getPosition();

}

package com.design.patterns.learning.designpattern.proxy.dynamicproxy;

import com.design.patterns.learning.designpattern.proxy.Position;

public interface Image {

    void setPosition(Position position);

    Position getPosition();

    void render();
}

package com.design.patterns.learning.designpattern.abstractfactory;

public interface Instance {

    enum Capacity {MICRO, SMALL, LARGE}

    void start();

    void attachStorage(Storage storage);

    void stop();

}

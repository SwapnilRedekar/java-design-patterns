package com.design.patterns.learning.designpattern.facade;

public class StationaryFactory {

    private StationaryFactory(){
    }

    public static Stationary createStationary() {
        return new HalloweenStationary();
    }

}

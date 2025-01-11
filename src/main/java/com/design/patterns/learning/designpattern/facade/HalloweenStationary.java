package com.design.patterns.learning.designpattern.facade;

public class HalloweenStationary implements Stationary {

    @Override
    public String getHeader() {
        return "It's Halloween.";
    }

    @Override
    public String getFooter() {
        return "Buy more stuff. It's Halloween!!!!";
    }

}

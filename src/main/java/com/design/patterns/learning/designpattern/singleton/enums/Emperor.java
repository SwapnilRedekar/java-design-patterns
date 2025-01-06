package com.design.patterns.learning.designpattern.singleton.enums;

public enum Emperor {

    EMPEROR;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

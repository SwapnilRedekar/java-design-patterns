package com.design.patterns.learning.designpattern.singleton.eager;

public final class Emperor {

    private static final Emperor EMPEROR = new Emperor();

    private Emperor() {
    }

    public static Emperor getEmperor() {
        return EMPEROR;
    }

    

}

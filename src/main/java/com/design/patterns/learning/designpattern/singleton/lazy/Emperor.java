package com.design.patterns.learning.designpattern.singleton.lazy;

public final class Emperor {

    private static volatile Emperor EMPEROR;

    private Emperor() {

    }

    public static synchronized Emperor getEmperor() {
        if (EMPEROR == null) {
            synchronized(Emperor.class) {
                if (EMPEROR == null) {
                    EMPEROR = new Emperor();
                }
            }
        }
        return EMPEROR;
    }

    

}

package com.design.patterns.learning.designpattern.singleton.intializationholder;

public final class Emperor {

    private Emperor() {
        System.out.println("This will be called only once.");
    }
    
    private static class EmperorHolder {
        private static final Emperor EMPEROR = new Emperor();
    }

    public static Emperor getEmperor() {
        return EmperorHolder.EMPEROR;
    }
}

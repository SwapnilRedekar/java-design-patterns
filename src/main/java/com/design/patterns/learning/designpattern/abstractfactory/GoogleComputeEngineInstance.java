package com.design.patterns.learning.designpattern.abstractfactory;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Instance with " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Google compute instance started."); 
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Google compute instance attached " + storage);
    }

    @Override
    public void stop() {
        System.out.println("Google compute instance stopped.");
    }

    @Override
    public String toString() {
        return "Google Compute Engine Instance";
    }

}

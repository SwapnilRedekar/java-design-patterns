package com.design.patterns.learning.designpattern.abstractfactory;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Ec2Instance created with " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started.");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Ec2Instance attached with " + storage);
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped.");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }

}

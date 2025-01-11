package com.design.patterns.learning.designpattern.composite;

public class Client {

    public static void main(String[] args) {
        File directory = new Directory("Learning");
        directory.addFile(new BinaryFile("Java", 1024));
        directory.ls();

        System.out.println("-----------------------------");
        File file = new BinaryFile("AngularJS", 21);
        file.ls();

    }

}

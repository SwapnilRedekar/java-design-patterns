package com.design.patterns.learning.designpattern.singleton.eager;

public class Client {

    public static void main(String[] args) {
        Emperor emperorOne = Emperor.getEmperor();
        System.out.println(emperorOne.hashCode());
        Emperor emperorTwo = Emperor.getEmperor();
        System.out.println(emperorTwo.hashCode());
    }
}

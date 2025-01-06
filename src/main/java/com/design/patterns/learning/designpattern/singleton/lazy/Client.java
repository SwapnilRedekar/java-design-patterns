package com.design.patterns.learning.designpattern.singleton.lazy;

public class Client {

    public static void main(String[] args) {
        Emperor emperorOne = Emperor.getEmperor();
        Emperor emperorTwo = Emperor.getEmperor();

        System.out.println(emperorOne.equals(emperorTwo));
    }

}

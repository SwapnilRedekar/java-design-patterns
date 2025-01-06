package com.design.patterns.learning.designpattern.singleton.enums;

public class Client {

    public static void main(String[] args) {
        Emperor emperor = Emperor.EMPEROR;

        System.out.println(emperor.getValue());    
        emperor.setValue(100); 
        System.out.println(emperor.getValue());

    }


}
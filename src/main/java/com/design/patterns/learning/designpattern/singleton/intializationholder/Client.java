package com.design.patterns.learning.designpattern.singleton.intializationholder;

public class Client {

    public static void main(String[] args) {
        Emperor emperorOne = Emperor.getEmperor();
        Emperor emperorTwo = Emperor.getEmperor();
        Emperor emperorThree = Emperor.getEmperor();

        System.out.println(emperorOne == emperorTwo && emperorTwo == emperorThree ? "Singleton" : "Tripleton");
    }
    

}

package com.design.patterns.learning.designpattern.methodfactory;

public class Client {

    public static void main(String[] args) {
        PriceCreator priceCreator = new ListPriceCreator();
        Price price = priceCreator.getPrice();
        System.out.println(price);

        priceCreator = new ContractPriceCreator();
        price = priceCreator.getPrice();
        System.out.println(price);
    }
}

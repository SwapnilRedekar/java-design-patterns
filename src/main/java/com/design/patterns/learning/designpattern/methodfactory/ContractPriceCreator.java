package com.design.patterns.learning.designpattern.methodfactory;

public class ContractPriceCreator extends PriceCreator {

    @Override
    public Price getPrice() {
        return new ContractPrice();
    }   

}

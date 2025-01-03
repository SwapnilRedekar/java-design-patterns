package com.design.patterns.learning.designpattern.methodfactory;

public class ListPriceCreator extends PriceCreator {

    @Override
    public Price getPrice() {
        return new ListPrice();
    }

}

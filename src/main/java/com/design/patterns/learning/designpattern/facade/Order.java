package com.design.patterns.learning.designpattern.facade;

public class Order {

    private String id;

    private double total;

    public Order(String id, double total) {
        this.id = id;
        this.total = total;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

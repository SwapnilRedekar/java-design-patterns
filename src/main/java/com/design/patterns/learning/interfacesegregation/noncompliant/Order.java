package com.design.patterns.learning.interfacesegregation.noncompliant;

import java.time.LocalDateTime;

public class Order extends Entity{

    private LocalDateTime orderDate;

    private double totalPrice;

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}

package com.design.patterns.learning.interfacesegregation.compliant;

import java.time.LocalDateTime;

public class Order extends Entity {

    private LocalDateTime lastLogin;

    private double totalPrice;

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}

package com.design.patterns.learning.interfacesegregation.compliant;

import java.util.ArrayList;
import java.util.List;

public class OrderPersistanceService implements PersistanceService<Order> {
    
    private static final List<Order> ORDERS = new ArrayList<>();
    
    @Override
    public void save(Order order) {
        ORDERS.add(order);
    }

    @Override
    public void delete(Order order) {
        ORDERS.remove(order);    
    }

    @Override
    public Order findById(long id) {
        return ORDERS.stream()
        .filter(order -> order.getId() == id)
        .findFirst()
        .orElse(null);
    }

}

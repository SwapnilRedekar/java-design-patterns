package com.design.patterns.learning.interfacesegregation.noncompliant;

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

    /*
     * This method is not supported by the Order entity
     * This is a violation of the Interface Segregation Principle.
     */
    @Override
    public Order findByName(String name) {
        throw new UnsupportedOperationException("Operation not supported");
    }

}

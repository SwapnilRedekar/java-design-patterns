package com.design.patterns.learning.designpattern.adapter.classadapter;

public class CustomerEmployeeAdapter extends Employee implements Customer {

    @Override
    public String getFullName() {
        return this.getName();
    }

    @Override
    public String getOccupation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }

}

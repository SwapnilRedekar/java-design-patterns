package com.design.patterns.learning.designpattern.adapter.objectadapter;

public class EmployeeCustomerAdapter implements Customer{

    private Employee employee;

    public EmployeeCustomerAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return employee.getName();
    }

    @Override
    public String getOccupation() {
        return employee.getJobTitle();
    }

    @Override
    public String getLocation() {
        return employee.getOfficeAddress();
    }

    

}

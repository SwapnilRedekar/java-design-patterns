package com.design.patterns.learning.designpattern.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        Employee employee = createEmployee();
        EmployeeCustomerAdapter adapter = new EmployeeCustomerAdapter(employee);
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        String card = cardDesigner.designCard(adapter);
        System.out.println(card);
    }

    private static Employee createEmployee() {
        Employee employee = new Employee();
        employee.setName("Radhe Krishna");
        employee.setJobTitle("Omnicient");
        employee.setOfficeAddress("Universe");
        return employee;
    }

}

package com.design.patterns.learning.designpattern.adapter.classadapter;

public class Client {


    public static void main(String[] args) {
        CustomerEmployeeAdapter adapter = new CustomerEmployeeAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        String card = cardDesigner.designCard(adapter);
        System.out.println(card);
        /*
         * Adapter object is used by both populateEmployeeData() and designCard() method. 
         * Hence, this is called two-way adapter.
         */
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setName("Roshni Jha");
        employee.setJobTitle("DevOps Engineer");
        employee.setOfficeLocation("Gurgaon");
    }
}

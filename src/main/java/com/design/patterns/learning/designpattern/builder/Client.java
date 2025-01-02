package com.design.patterns.learning.designpattern.builder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
        .withFirstName("Sanchita")
        .withLastName("Singh")
        .withDateOfBirth(LocalDate.of(1989, 10, 31))
        .withFlatNo("201-0707")
        .withStreetName("Manjari Road")
        .withCity("Pune")
        .withZip("411057")
        .withState("Maharashtra")
        .withBasicPay(45000.0)
        .withVehicleAllowance(12050.76)
        .withHouseRentAllowance(35242.90)
        .build();
        System.out.println(employee);
    }

}

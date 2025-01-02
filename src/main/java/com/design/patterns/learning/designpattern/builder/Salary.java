package com.design.patterns.learning.designpattern.builder;

public class Salary {

    private double basic;

    private double houseRentAllowance;

    private double vehicleAllowanace;

    private Salary(double basic, double houseRentAllowance, double vehicleAllowanace) {
        this.basic = basic;
        this.houseRentAllowance = houseRentAllowance;
        this.vehicleAllowanace = vehicleAllowanace;
    }

    public double getBasic() {
        return basic;
    }

    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public double getVehicleAllowanace() {
        return vehicleAllowanace;
    }

    public static Salary of(double basic, double houseRentAllowance, double vehicleAllowanace) {
        return new Salary(basic, houseRentAllowance, vehicleAllowanace);
    }

    public String toString() {
        return "Salary [basic=" + basic + ", houseRentAllowance=" + houseRentAllowance + ", vehicleAllowanace=" + vehicleAllowanace + "]";
    }
    

}

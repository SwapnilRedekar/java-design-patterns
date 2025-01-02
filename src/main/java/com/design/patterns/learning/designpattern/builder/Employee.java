package com.design.patterns.learning.designpattern.builder;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;

    private String age;

    private Address address;

    private Salary salary;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Salary getSalary() {
        return salary;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setAddress(Address address) {
        this.address = address;
    }

    private void setSalary(Salary salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", salary=" + salary + "]";
    }

    public static class EmployeeBuilder {

         private String firstName;

         private String lastName;

         private String age;

         private String flatNo;

         private String streetName;

         private String city;

         private String state;

         private String zip;

         private double basicPay;

         private double houseRentAllowance;

         private double vehicleAllowanace;

         private Employee employee;

         public EmployeeBuilder withFirstName(String firstName) {
             this.firstName = firstName;
             return this;
         }


         public EmployeeBuilder withLastName(String lastName) {
             this.lastName = lastName;
             return this;
         }

        public EmployeeBuilder withDateOfBirth(LocalDate dateOfBirth) {
                Period ageInYears = Period.between(dateOfBirth, LocalDate.now());
                this.age = String.valueOf(ageInYears.getYears());
                return this;
        }
        
        public EmployeeBuilder withFlatNo(String flatNo) {
            this.flatNo = flatNo;
            return this;
        }

        public EmployeeBuilder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public EmployeeBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public EmployeeBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public EmployeeBuilder withZip(String zip) {
            this.zip = zip;
            return this;
        }

        public EmployeeBuilder withBasicPay(double basicPay) {
            this.basicPay = basicPay;
            return this;
        }

        public EmployeeBuilder withHouseRentAllowance(double houseRentAllowance) {
            this.houseRentAllowance = houseRentAllowance;
            return this;
        }

        public EmployeeBuilder withVehicleAllowance(double vehicleAllowanace) {
            this.vehicleAllowanace = vehicleAllowanace;
            return this;
        }

        public Employee build() {
            this.employee = new Employee();
            employee.setName(firstName + " " + lastName);
            employee.setAge(age);
            Address address = Address.of(flatNo, streetName, city, state, zip);
            employee.setAddress(address);
            Salary salary = Salary.of(basicPay, houseRentAllowance, vehicleAllowanace);
            employee.setSalary(salary);
            return employee;
        }

        public EmployeeBuilder getEmployeeBuilder() {
            return new EmployeeBuilder();
        }

        public Employee getEmployee() {
            return this.employee;
        }   
    }

}

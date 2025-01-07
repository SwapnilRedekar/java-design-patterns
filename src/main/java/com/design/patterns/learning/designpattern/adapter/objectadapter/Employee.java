package com.design.patterns.learning.designpattern.adapter.objectadapter;

public class Employee {

    private String name;

    private String jobTitle;

    private String officeAddress;

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getOfficeAddress() {
        return this.officeAddress;
    }

}

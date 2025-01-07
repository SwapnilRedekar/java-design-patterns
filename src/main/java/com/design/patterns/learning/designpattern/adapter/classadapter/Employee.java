package com.design.patterns.learning.designpattern.adapter.classadapter;

/*
 * Adaptee class - Client needs functionality of this.
 */
public class Employee {

    private String name;

    private String jobTitle;

    private String officeLocation;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return this.officeLocation;
    }

}

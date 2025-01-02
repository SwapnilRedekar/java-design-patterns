package com.design.patterns.learning.designpattern.builder;

public class Address {

    private String flatNo;

    private String streetName;

    private String city;    

    private String state;

    private String zip;

    private Address(String flatNo, String streetName, String city, String state, String zip) {
        this.flatNo = flatNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String getFlatNo() {
        return flatNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public static Address of(String flatNo, String streetName, String city, String state, String zip) {
        return new Address(flatNo, streetName, city, state, zip);
    }

    public String toString() {
        return "Address [flatNo=" + flatNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }

}

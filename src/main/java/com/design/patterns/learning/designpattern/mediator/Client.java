package com.design.patterns.learning.designpattern.mediator;

public class Client {

    public static void main(String[] args) {
        AirTrafficControlImpl airTrafficControl = new AirTrafficControlImpl();
        CommercialAirplane commercialAirplaneOne = new CommercialAirplane(airTrafficControl);
        CommercialAirplane commercialAirplaneTwo = new CommercialAirplane(airTrafficControl);
        commercialAirplaneOne.requestTakeOff();
        commercialAirplaneTwo.requestLanding();
    }
}

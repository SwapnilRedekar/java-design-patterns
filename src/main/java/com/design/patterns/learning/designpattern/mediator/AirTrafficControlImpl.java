package com.design.patterns.learning.designpattern.mediator;

public class AirTrafficControlImpl implements AirTrafficControl{

    public void requestTakeOff(Airplane airplane) {
        airplane.reportAirTrafficControl("Requesting takeoff clearance");
    }

    public void requestLanding(Airplane airplane) {
        airplane.reportAirTrafficControl("Requesting landing clearance");
    }

}

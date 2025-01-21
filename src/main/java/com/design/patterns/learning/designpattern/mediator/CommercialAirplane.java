package com.design.patterns.learning.designpattern.mediator;

public class CommercialAirplane implements Airplane {

    //This is mediator
    private AirTrafficControl airTrafficControl;

    public CommercialAirplane(AirTrafficControl airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
    }

    @Override
    public void requestTakeOff() {
        airTrafficControl.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        airTrafficControl.requestLanding(this);
    }

    @Override
    public void reportAirTrafficControl(String message) {
        System.out.println("Commercial Airplane: " + message);
    }

    



}

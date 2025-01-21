package com.design.patterns.learning.designpattern.mediator;

public interface Airplane {

    void requestTakeOff();
    void requestLanding();
    void reportAirTrafficControl(String message);
}

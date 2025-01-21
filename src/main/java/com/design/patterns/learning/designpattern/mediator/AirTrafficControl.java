package com.design.patterns.learning.designpattern.mediator;

public interface AirTrafficControl {

    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}

package com.design.patterns.learning.designpattern.chainofresponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();

}

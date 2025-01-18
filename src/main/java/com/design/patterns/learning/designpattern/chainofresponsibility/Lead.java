package com.design.patterns.learning.designpattern.chainofresponsibility;

import com.design.patterns.learning.designpattern.chainofresponsibility.LeaveApplication.TYPE;

public class Lead extends Employee {

    public Lead(LeaveApprover leaveApprover) {
        super("Lead", leaveApprover);
    }
    @Override
    protected boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == TYPE.SICK_LEAVE && leaveApplication.getNumberOfDays() <= 2) {
            leaveApplication.approve("Lead");
            return true;
        } else {
            return false;
        }
    }



}

package com.design.patterns.learning.designpattern.chainofresponsibility;

import com.design.patterns.learning.designpattern.chainofresponsibility.LeaveApplication.TYPE;

public class Manager extends Employee {

    public Manager(LeaveApprover leaveApprover) {
        super("Manager", leaveApprover);
    }

    @Override
    protected boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if ((leaveApplication.getType() == TYPE.SICK_LEAVE && leaveApplication.getNumberOfDays() > 2 )
            || leaveApplication.getType() == TYPE.EARNED_LEAVE ) {
                leaveApplication.approve("Manager");
                return true;
        } else 
                return false;
    }

}

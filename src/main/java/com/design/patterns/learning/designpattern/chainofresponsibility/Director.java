package com.design.patterns.learning.designpattern.chainofresponsibility;

import com.design.patterns.learning.designpattern.chainofresponsibility.LeaveApplication.TYPE;

public class Director extends Employee {

    public Director(LeaveApprover leaveApprover) {
        super("Director", leaveApprover);
    }

    @Override
    protected boolean canApproveLeaveRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == TYPE.LEAVE_WITHOUT_PAY) {
           leaveApplication.approve("Director");
           return true;
        } else 
           return false;  
    }

}

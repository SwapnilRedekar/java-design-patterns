package com.design.patterns.learning.designpattern.chainofresponsibility;

public abstract class Employee implements LeaveApprover {

    private String role;
    private LeaveApprover successor;

    protected Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!canApproveLeaveRequest(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    protected abstract boolean canApproveLeaveRequest(LeaveApplication leaveApplication);

}

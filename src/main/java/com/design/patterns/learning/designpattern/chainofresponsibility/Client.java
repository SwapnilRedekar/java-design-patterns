package com.design.patterns.learning.designpattern.chainofresponsibility;

import java.time.LocalDate;

import com.design.patterns.learning.designpattern.chainofresponsibility.LeaveApplication.STATUS;
import com.design.patterns.learning.designpattern.chainofresponsibility.LeaveApplication.TYPE;

public class Client {

    public static void main(String[] args) {
        LeaveApplication leaveApplication = LeaveApplication.getLeaveApplicationBuilder()
        .withType(TYPE.LEAVE_WITHOUT_PAY)
        .withStatus(STATUS.PENDING)
        .withFrom(LocalDate.now())
        .withTo(LocalDate.of(2025, 1, 26))
        .withApprovedBy(null)
        .build();
        System.out.println(leaveApplication);
        System.out.println("-----------------------------------");
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(leaveApplication);
        System.out.println(leaveApplication);
        
    }

    private static LeaveApprover createChain() {
        Employee director = new Director(null);
        Employee manager = new Manager(director);
        return new Lead(manager);
    }
}

package com.design.patterns.learning.designpattern.chainofresponsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LeaveApplication {

    public enum TYPE {SICK_LEAVE, EARNED_LEAVE, LEAVE_WITHOUT_PAY}
    public enum STATUS {PENDING, APPROVED, REJECTED}
    private TYPE type;
    private STATUS status;
    private LocalDate from;
    private LocalDate to;
    private String approvedBy;
    private long numberOfDays;

    public TYPE getType() {
        return this.type;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public LocalDate getFrom() {
        return this.from;
    }

    public LocalDate getTo() {
        return this.to;
    }

    public String getApprovedBy() {
        return this.approvedBy;
    }

    public long getNumberOfDays() {
        return this.numberOfDays;
    }

    private LeaveApplication(TYPE type, STATUS status, LocalDate from, LocalDate to, String approvedBy, long numberOfDays) {
        this.type = type;
        this.status = status;
        this.from = from;
        this.to = to;
        this.approvedBy = approvedBy;
        this.numberOfDays = numberOfDays;
    }

    static class LeaveApplicationBuilder {

        private TYPE type;
        private STATUS status;
        private LocalDate from;
        private LocalDate to;
        private String approvedBy;

        private LeaveApplicationBuilder() {

        }

        public LeaveApplicationBuilder withType(TYPE type) {
             this.type = type;
             return this;   
        }

        public LeaveApplicationBuilder withStatus(STATUS status) {
             this.status = status;
             return this;
        }

        public LeaveApplicationBuilder withFrom(LocalDate from) {
             this.from = from;
             return this;
        }

        public LeaveApplicationBuilder withTo(LocalDate to) {
             this.to = to;
             return this; 
        }

        public LeaveApplicationBuilder withApprovedBy(String approvedBy) {
             this.approvedBy = approvedBy;
             return this;
        }

        public LeaveApplication build() {
             return new LeaveApplication(type, status, from, to, approvedBy, ChronoUnit.DAYS.between(to, from));
        }

    }

    public static LeaveApplicationBuilder getLeaveApplicationBuilder() {
        return new LeaveApplicationBuilder();
    }

    public void approve(String approvedBy) {
        this.status = STATUS.APPROVED;
        this.approvedBy = approvedBy;
    }

    public void reject(String approvedBy) {
        this.status = STATUS.REJECTED;
        this.approvedBy = approvedBy;
    }
    
    @Override
	public String toString() {
		return type + " leave for "+ numberOfDays +" day(s) "+status
				+ " by "+ approvedBy;
	}

}

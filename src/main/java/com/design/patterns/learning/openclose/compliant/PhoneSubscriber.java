package com.design.patterns.learning.openclose.compliant;

public class PhoneSubscriber extends Subscriber {

    private int baseRate;

    @Override
    public int calculateBill() {
        int totalUsage = UsageHistory.getCallDuration().stream().mapToInt(Integer::intValue).sum();
        return totalUsage * baseRate / 100;
    }

}

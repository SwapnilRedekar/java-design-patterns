package com.design.patterns.learning.openclose.compliant;

import java.util.List;

/*
 * This is open for modifications. 
 */
public class ISPSubscriber extends Subscriber{

    private int baseRate;

    private int freeUsageUnits;

    @Override
    public int calculateBill() {
        List<Integer> internetUsage = UsageHistory.getInternetUsage();
        int totalUsage = internetUsage.stream().mapToInt(Integer::intValue).sum();
        int chargeableUsage = totalUsage - freeUsageUnits;

        if (chargeableUsage <= 0)
           return 0;

        return chargeableUsage * baseRate / 100;
    }

}

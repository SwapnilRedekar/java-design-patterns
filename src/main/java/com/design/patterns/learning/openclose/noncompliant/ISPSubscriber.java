package com.design.patterns.learning.openclose.noncompliant;

/*
 * This class has four attributes and a method same as the PhoneSubscriber class. This is causing code duplication.
 * If new subscriber of type VoiceOverIP is added, then the same attributes and method will be added to that class as well.
 * This is a violation of the Open-Closed Principle.
 */
public class ISPSubscriber {

    private int subscriberId;

    private String subscriberName;

    private String subscriberAddress;

    private int phoneNumber;

    private int baseRate;

    private int freeUsageLimit;

    public ISPSubscriber() {

    }

    public double calculateBill() {
        int usage = UsageHistory.getInternetDataUsage().stream().mapToInt(Integer::intValue).sum();
        int chargeableData = usage - freeUsageLimit;
        
        if (chargeableData <= 0) 
           return 0;
        
        return chargeableData * baseRate / 100;
    }

    public int getSubscriberId() {
        return subscriberId;
    }   

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }   

    public void setSubscriberAddress(String subscriberAddress) {
        this.subscriberAddress = subscriberAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }   

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public int getFreeUsageLimit() {
        return freeUsageLimit;
    }

    public void setFreeUsageLimit(int freeUsageLimit) {
        this.freeUsageLimit = freeUsageLimit;
    }   

}

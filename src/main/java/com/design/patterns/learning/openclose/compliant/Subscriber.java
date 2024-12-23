package com.design.patterns.learning.openclose.compliant;

/*
 * This is the base class for all the subscribers. It has the common attributes and methods that are shared by all the
 * subscribers. This is now closed for modification as we can add new subscribers without modifying this class.
 */
public abstract class Subscriber {

    private int subscriberId;

    private String subscriberName;

    private String subscriberAddress;

    private int phoneNumber;

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberAddress(String subscriberAddress) {
        this.subscriberAddress = subscriberAddress;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public abstract int calculateBill();

}

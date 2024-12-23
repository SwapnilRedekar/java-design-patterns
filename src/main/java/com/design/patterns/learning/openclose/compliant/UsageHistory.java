package com.design.patterns.learning.openclose.compliant;

import java.util.List;

public class UsageHistory {

    public static List<Integer> getInternetUsage() {
        return List.of(12, 3, 2, 56, 12);
    }

    public static List<Integer> getCallDuration() {
        return List.of(11, 60, 2, 56, 12);
    }

}

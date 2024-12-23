package com.design.patterns.learning.openclose.noncompliant;

import java.util.List;

public class UsageHistory {

    public static List<Integer> getInternetDataUsage() {
        return List.of(1, 5, 3, 6, 2, 10);
    }

    public static List<Integer> getCallDuration() {
        return List.of(21, 5, 13, 6, 10, 10);
    }
    
}

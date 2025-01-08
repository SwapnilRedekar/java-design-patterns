package com.design.patterns.learning.designpattern.bridge;

public interface FIFOCollection<T> {

    void offer(T element);

    T poll();

}

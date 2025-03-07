package com.design.patterns.learning.designpattern.bridge;

public interface LinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();

}

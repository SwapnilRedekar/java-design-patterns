package com.design.patterns.learning.designpattern.bridge;

public class Queue<T> implements FIFOCollection<T> {

    private LinkedList<T> linkedList;

    public Queue(LinkedList<T> linkedList) {
         this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }

}

package com.design.patterns.learning.designpattern.bridge;

public class Client {

    public static void main(String[] args) {
        FIFOCollection<Integer> integers = new Queue<>(new SingleLinkedList<>());
        integers.offer(10);
        integers.offer(100);
        integers.offer(1000);
        integers.offer(10000);

        System.out.println(integers.poll());
    }
}

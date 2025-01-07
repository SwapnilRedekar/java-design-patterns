package com.design.patterns.learning.designpattern.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int size) {
       availablePool = new LinkedBlockingQueue<>();
       IntStream.range(0, size)
       .forEach(i -> availablePool.offer(creator.get()));
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public void release(T object) {
         object.reset();
         try {
            availablePool.put(object);
         } catch(InterruptedException e) {
            System.err.println("put() method id interrupted.");
            Thread.currentThread().interrupt();
         }
    }

}

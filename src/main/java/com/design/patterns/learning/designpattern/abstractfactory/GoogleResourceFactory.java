package com.design.patterns.learning.designpattern.abstractfactory;

import com.design.patterns.learning.designpattern.abstractfactory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleStorage(capMib);
    }

}

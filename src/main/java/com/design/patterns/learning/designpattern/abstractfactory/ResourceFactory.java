package com.design.patterns.learning.designpattern.abstractfactory;

import com.design.patterns.learning.designpattern.abstractfactory.Instance.Capacity;

public interface ResourceFactory {

    Instance createInstance(Capacity capacity);

    Storage createStorage(int capMib);

}

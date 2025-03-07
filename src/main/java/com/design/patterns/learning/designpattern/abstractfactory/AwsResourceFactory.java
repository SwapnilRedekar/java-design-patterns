package com.design.patterns.learning.designpattern.abstractfactory;

import com.design.patterns.learning.designpattern.abstractfactory.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }

}

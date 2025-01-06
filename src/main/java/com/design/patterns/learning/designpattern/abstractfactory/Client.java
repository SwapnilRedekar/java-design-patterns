package com.design.patterns.learning.designpattern.abstractfactory;

import com.design.patterns.learning.designpattern.abstractfactory.Instance.Capacity;

public class Client {

    private ResourceFactory resourceFactory;

    public Client (ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer (Capacity capacity, int storageMib) {
        Instance server = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        server.attachStorage(storage);
        return server;
    }

    public static void main(String[] args) {

        Client aws = new Client(new AwsResourceFactory());
        Instance serverOne = aws.createServer(Capacity.LARGE, 200000);
        serverOne.start();
        serverOne.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance serverTwo = gcp.createServer(Capacity.SMALL, 1003030);
        serverTwo.start();
        serverTwo.stop();
    }

}

package com.design.patterns.learning.designpattern.objectpool;

public class Client {

    public static final ObjectPool<Picaso> picasos = new ObjectPool<>(() -> new Picaso("standing.bmp"), 0);

    public static void main(String[] args) {
        Picaso picasoOne = picasos.get();
        picasoOne.setPosition(Position.of(-10, -10));
        Picaso picasoTwo = picasos.get();
        picasoTwo.setPosition(Position.of(5, 5));

        picasoOne.draw();
        picasoTwo.draw();

        picasos.release(picasoOne);

        picasos.release(picasoTwo);


    }

}

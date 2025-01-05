package com.design.patterns.learning.designpattern.prototype;

public class Client {

    public static void main(String... args) throws CloneNotSupportedException {
        Pawn pawnOne = new Pawn();
        pawnOne.initiaize("A", "2");
        Pawn pawnTwo = (Pawn) pawnOne.clone();
        pawnTwo.initiaize("A", "3");

        pawnTwo.move("A", "4");

        System.out.println(pawnTwo);

        King king = new King();

        King duplicate = (King) king.clone();

        System.out.println(duplicate);
        
    }

}

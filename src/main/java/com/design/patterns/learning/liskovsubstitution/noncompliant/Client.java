package com.design.patterns.learning.liskovsubstitution.noncompliant;

public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());

        Rectangle square = new Square(10);
        System.out.println(square.getArea());

        useRectangle(rectangle);

        useRectangle(square);

    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        /*
         * Here, Rectangle class gives inteded result. But, when we pass Square object to this method, it fails.
         * This is because, Square class extends Rectangle class and overrides the setWidth and setHeight methods.
         * This is not compliant with Liskov Substitution Principle.
         */

        if (rectangle.getHeight() != 10) {
            throw new AssertionError("Height not equal to 10");
        } else {
            System.out.println("Height is equal to 10");
        }

        if(rectangle.getWidth() != 20) {
            throw new AssertionError("Width not equal to 20");
        } else {
            System.out.println("Width is equal to 20");
        }
    }
}

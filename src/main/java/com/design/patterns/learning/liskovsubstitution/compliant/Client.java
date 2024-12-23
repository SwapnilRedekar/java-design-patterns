package com.design.patterns.learning.liskovsubstitution.compliant;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Shape square = new Square(10);
        System.out.println("Square area: " + square.getArea());

        useShape(rectangle);

        useShape(square);
    }

    /*
     * In this method, we are using Shape interface instead of Rectangle class.
     * This is compliant with Liskov Substitution Principle. This method consumes both Rectangle and Square objects.
     */
    private static void useShape(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            rectangle.setHeight(10);
            rectangle.setWidth(20);

            if (rectangle.getHeight() != 10) {
                throw new AssertionError("Height not equal to 10");
            } else {
                System.out.println("Height is equal to 10");
            }

            if (rectangle.getWidth() != 20) {
                throw new AssertionError("Width not equal to 20");
            } else {
                System.out.println("Width is equal to 20");
            }
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            square.setSide(10);

            if (square.getSide() != 10) {
                throw new AssertionError("Side not equal to 10");
            } else {
                System.out.println("Side is equal to 10");
            }
        }
    }

}

package com.brainacad.oop.testshapes;

/**
 * Created by Yuriy on 21.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Red");
        System.out.println(shape);
        System.out.println();

        Circle circle = new Circle("Green", 2.0);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calcArea());
        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", 11.0, 22.0);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calcArea());
        System.out.println();

        Triangle triangle = new Triangle("Yellow", 5.0, 5.0, 5.0);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea());
        System.out.println();

        Shape[] arr = {new Rectangle("Green", 2, 2), new Rectangle("Pink", 2, 3), new Rectangle("Black", 2, 4),
                new Rectangle("Yellow", 2, 5), new Rectangle("White", 2, 6), new Circle("Blue", 3), new Circle("Red", 4),
                new Triangle("Grey", 1, 2, 3), new Triangle("Brown", 2, 3, 4)};

        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        for (Shape a : arr) {
            sumArea += a.calcArea();
            System.out.println(a + ", area is: " + a.calcArea());
            System.out.println();
            if (a instanceof Rectangle)
                sumRectArea+=a.calcArea();
            if (a instanceof Triangle)
                sumTriangleArea+=a.calcArea();
            if (a instanceof Circle)
                sumCircleArea+=a.calcArea();
        }
        System.out.println("Total sum of all shapes areas:"+sumArea);
        System.out.println();
        System.out.println("Rectangles total area: "+sumRectArea);
        System.out.println();
        System.out.println("Triangle total area: "+sumTriangleArea);
        System.out.println();
        System.out.println("Circle total area: "+sumCircleArea);
    }
}

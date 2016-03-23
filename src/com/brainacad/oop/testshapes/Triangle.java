package com.brainacad.oop.testshapes;

/**
 * Created by Yuriy on 21.03.2016.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s;
        s=(a+b+c)/2;
        return Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }

    @Override
    public String toString() {
        return "This is Triangle, " +
                "color: " + shapeColor +
                " a: " + this.a+
                " b: " + this.b+
                " c: " + this.c;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

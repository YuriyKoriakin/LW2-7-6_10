package com.brainacad.oop.testshapes;

/**
 * Created by Yuriy on 21.03.2016.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calcArea() {
        return Math.round(this.getRadius() * this.getRadius() * Math.PI * 1000) / 1000.0;
    }

    @Override
    public String toString() {
        return "This is Circle, " +
                "color: " + shapeColor +
                ", radius = " + this.getRadius();

    }
}
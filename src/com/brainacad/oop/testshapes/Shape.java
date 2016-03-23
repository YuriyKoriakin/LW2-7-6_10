package com.brainacad.oop.testshapes;

/**
 * Created by Yuriy on 21.03.2016.
 */
public class Shape {
    String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;

    }

    @Override
    public String toString() {
        return "This is Shape, " +
                "color is: " + shapeColor +
                " Shape area is: 0";
    }

    public double calcArea (){
        return 0.0;
    }
}

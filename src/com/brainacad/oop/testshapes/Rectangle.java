package com.brainacad.oop.testshapes;

/**
 * Created by Yuriy on 21.03.2016.
 */
public class Rectangle extends Shape {//створюємо клас, який наслідується від Shape
    private double width;
    private double height;

    public Rectangle(String shapeColor,double width,double height) {//для запобігання помилки створюємо конструктор
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return Math.round(this.getWidth() * this.getHeight());//перевизначили метод calcArea
    }

    @Override
    public String toString() {
        return "This is Rectangle, " +
                "color: " + shapeColor +
                " Width: " + this.width+
                " Heigth: " + this.height;
    }
}



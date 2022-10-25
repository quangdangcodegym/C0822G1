package com.codegym.oop;

public class Rectangle extends Geometric{

    private static Rectangle rectangle;
    public Rectangle() {

    }

    public static Rectangle getInstance() {
        if (Rectangle.rectangle == null) {
            Rectangle.rectangle = new Rectangle();
        }
        return Rectangle.rectangle;
    }


}

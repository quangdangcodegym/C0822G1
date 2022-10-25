package com.codegym.THTrienKhaiInterfaceResizeable;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double height) {
        this.length = height;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a class of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent / 200);
        this.width += (percent / 200);
    }
}

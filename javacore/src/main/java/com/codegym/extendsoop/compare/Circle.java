package com.codegym.extendsoop.compare;

public class Circle extends Geometric implements MyCompareble {
    private double radius;

    public  Circle() {
    }



    public  Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }

    @Override
    public String toString() {
        return "Area: " + getRadius() + super.toString();
    }

    @Override
    public int CompareTo(Object c1) {
        Circle c = (Circle) c1;
        if (this.getRadius() >= c.getRadius()) {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

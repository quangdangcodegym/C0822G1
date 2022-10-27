package com.codegym.basic.extendsoop.compare;

public class Circle extends Geometric implements Comparable<Circle> {
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
        return "Area: " + getRadius() ;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() >= o.getRadius()) {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

package com.codegym.myarraylist;

import java.util.Objects;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {

    }

    @Override
    public boolean equals(Object o) {
        Circle c = (Circle) o;
        if (this == o) {
            return true;
        }
        if (this.getRadius() == c.getRadius()) {
            return true;
        }
        return false;
    }

//    @Override
//    public int hashCode() {
////        System.out.println("---------: " + Objects.hash(radius));
//        return Objects.hash(radius);
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Circle circle = (Circle) o;
//        return Double.compare(circle.radius, radius) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(radius);
//    }
}

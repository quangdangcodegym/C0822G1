package com.codegym.extendsoop.Abstract;

public class Circle extends Geometry{
    private double r;

    public Circle(CreateDegrees toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double Area() {
        return Math.PI*this.r*this.r;
    }
}

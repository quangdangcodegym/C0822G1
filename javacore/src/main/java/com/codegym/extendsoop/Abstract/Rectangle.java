package com.codegym.extendsoop.Abstract;

public class Rectangle extends Geometry{
    private double  width;
    private double height;

    public Rectangle(CreateDegrees toaDo, double chieuRong, double chieuCao) {
        super(toaDo);
        this.width = chieuRong;
        this.height = chieuCao;
    }

    @Override
    public double Area() {
        return this.width*this.height;
    }
}

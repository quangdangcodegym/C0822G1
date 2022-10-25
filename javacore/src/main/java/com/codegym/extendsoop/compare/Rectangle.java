package com.codegym.extendsoop.compare;

import com.codegym.extendsoop.Abstract.CreateDegrees;
import com.codegym.extendsoop.Abstract.Geometry;

public class Rectangle extends Geometry implements MyCompareble{
    private double  width;
    private double height;

    public Rectangle(CreateDegrees toaDo, double chieuRong, double chieuCao) {
        super(toaDo);
        this.width = chieuRong;
        this.height = chieuCao;
    }

    public Rectangle(double dai, double rong) {
        super();
        this.width = dai;
        this.height = rong;
    }
    public Rectangle(){
        super();

    }

    @Override
    public double Area() {
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Area: " + this.Area();
    }

    @Override
    public int CompareTo(Object c) {
        Rectangle c1 = (Rectangle) c;
        if (this.Area() >= c1.Area()) {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

package com.codegym.extendsoop;

public class Cylinder extends EXCircle {
    private double height;

    public Cylinder(){

    }

    public Cylinder (double height , double radius , String color){
        super(radius,color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * getRadius()*getRadius()*this.height;
    }
    public String toString(){
        return super.toString() + " height: " + this.height + " Volume : " + getVolume();
    }
}

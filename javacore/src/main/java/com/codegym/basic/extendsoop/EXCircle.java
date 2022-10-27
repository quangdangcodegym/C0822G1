package com.codegym.basic.extendsoop;

public class EXCircle {
    private double radius ;
    private String color ;

    public EXCircle(){

    }

    public EXCircle( double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Hình tròn có bán kính là :  " + this.radius + " và có màu " + this.color;
    }

    public static void main(String[] args) {
        EXCircle circle = new EXCircle();

        EXCircle circle1 = new EXCircle(3 , "black");
        System.out.println(circle1.toString());
    }
}

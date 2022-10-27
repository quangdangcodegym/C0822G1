package com.codegym.basic.oop;

public class Rectangle {

    // access modifier: public, protectic, private, defaul;
    double width;
    double height;
    private int a ;

    public int getA(){
        return this.a;
    }
    public void setA( int a){
         this.a = a;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;


    }
    public Rectangle(){

    }
    //str = "{'width': 6, 'height': 5}"
    //str ="6,5"
    public Rectangle(String str){
        String[] arrStr = str.split(",");
        this.width = Double.parseDouble(arrStr[0]);
        this.height = Double.parseDouble((arrStr[1]));
    }

     double getArea(){
        int a = 10;
        this.a = 20;
         System.out.println(a);
        double area = this.height*this.width;
        return area;
    }
    public double getPerimeter(){
        System.out.println(a);
        double perimeter = (this.height + this.height)*2;
        return perimeter;
    }
}

package com.codegym.extendsoop.Abstract;

import com.codegym.extendsoop.compare.Rectangle;

public class Test {
    public static void main(String[] args) {
        CreateDegrees td1 = new CreateDegrees(5, 5);
        CreateDegrees td2 = new CreateDegrees(7, 9);
        CreateDegrees td3 = new CreateDegrees(12, 1);

//        Geometry h1 = new Point(td1);

        Geometry h2 = new Circle(td2, 10);

        Geometry h3 = new Rectangle(td3, 5, 10);

//        System.out.println("S1: "+h1.tinhDienTich());
//        System.out.println("S2: "+h2.tinhDienTich());
//        System.out.println("S3: "+h3.tinhDienTich());
    }
}

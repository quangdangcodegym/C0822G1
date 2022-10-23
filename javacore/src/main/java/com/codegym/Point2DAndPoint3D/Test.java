package com.codegym.Point2DAndPoint3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(1);
        point3D.setY(2);
        point3D.setZ(3);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
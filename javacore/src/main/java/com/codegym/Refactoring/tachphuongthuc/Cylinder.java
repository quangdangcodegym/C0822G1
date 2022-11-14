package com.codegym.Refactoring.tachphuongthuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}

//public class Cylinder {
//    public static double getVolume(int radius, int height){
//        double baseArea = getBaseArea(radius);
//        double perimeter = getPerimeter(radius);
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
//    }
//
//    private static double getPerimeter(int radius) {
//        return 2 * Math.PI  * radius;
//    }
//
//    private static double getBaseArea(int radius) {
//        return Math.PI * radius * radius;
//    }
//}

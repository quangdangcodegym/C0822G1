package com.codegym.oop;

import com.codegym.arrayandmethod.ArrayAndMethod;

import java.util.Arrays;

public class MainOOP {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int a  = 5;
        int [] b = {4,5,3};
//        Rectangle rectangle = new Rectangle(6, 5);
//        System.out.println(rectangle.getArea());
//        Rectangle rectangle = new Rectangle();
//
//
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.runStopWatch();
//
//        Rectangle rectangle = new Rectangle();


//        Rectangle a1 = new Rectangle(5, 6);
//        System.out.println(a1.hashCode());
//        Rectangle a2 = new Rectangle(5, 6);
//        System.out.println(a2.hashCode());
//        if (a1 == a2) {
//            System.out.println("TRUE");
//        }else{
//            System.out.println("FALSE");
//        }

        String c1 = "Hello";
        String c3 = new String("Hello");
        String c4 = "nguyen";

        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        c1.equals(c3);
        if (c1 == c3) {
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
}

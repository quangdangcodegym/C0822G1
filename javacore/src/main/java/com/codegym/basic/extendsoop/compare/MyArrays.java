package com.codegym.basic.extendsoop.compare;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        circles[0] = new Circle(7);
        circles[1] = new Circle(1);
        circles[2] = new Circle(4);
        circles[3] = new Circle(5);
        circles[4] = new Circle(7);

        System.out.println(Arrays.toString(circles));
        System.out.println("-------------");
        System.out.println(circles[0]);
        System.out.println(circles[1]);
        mySwap(circles[1], circles[0]);

        System.out.println("-------------");
        System.out.println(Arrays.toString(circles));
//        sort(circles);
//        System.out.println(Arrays.toString(circles));
//        Rectangle[] rectangles = new Rectangle[3];
//        rectangles[0] = new Rectangle(2, 3);
//        rectangles[1] = new Rectangle(3, 3);
//        rectangles[2] = new Rectangle(1, 2);
//
//        mySort(rectangles);
//        System.out.println(Arrays.toString(rectangles));



    }

    public static void sort(Circle[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                MyCompareble a1 = (MyCompareble) a[i];
                if (a1.CompareTo(a[j])==1) {
//                    Circle temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
                    mySwap(a[i], a[j]);
                }
            }
        }
    }

    public static void mySort(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                MyCompareble a1 = (MyCompareble) a[i];
                if(a1.CompareTo(a[j])==1){
                    Object temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void mySwap(Circle c1, Circle c2) {
        System.out.println(c1);
        System.out.println(c2);
        Circle temp = c1;
        c1 = c2;
        c2 = temp;
    }

}

package com.codegym.extendsoop.compare.nghiacomparable;
import com.codegym.extendsoop.compare.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(5.6,"yellow", false);
//        circles[1] = new ComparableCircle(5.6);
//        circles[2] = new ComparableCircle();
//        for (ComparableCircle c: circles) {
//            System.out.println(c);
//        }
//        Arrays.sort(circles);
//        System.out.println();
//        for (ComparableCircle a : circles){
//            System.out.println(a);
//        }

        Circle[] listCircle = new Circle[3];
        listCircle[0] = new Circle(7);
        listCircle[1] = new Circle(6);
        listCircle[2] = new Circle(1);
//        Arrays.sort(listCircle);
        MyArrays.mySort(listCircle);

        System.out.println(Arrays.toString(listCircle));



    }
}
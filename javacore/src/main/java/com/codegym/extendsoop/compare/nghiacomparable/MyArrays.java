package com.codegym.extendsoop.compare.nghiacomparable;

import com.codegym.extendsoop.compare.Circle;
import com.codegym.extendsoop.compare.MyCompareble;

import java.util.Arrays;

public class MyArrays {

    public static void mySort(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                Comparable a1 = (Comparable) a[i];
                if(a1.compareTo(a[j])==1){
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

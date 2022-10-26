package com.codegym.extendsoop.compare.nghiacomparable;

import com.codegym.extendsoop.compare.Circle;
import com.codegym.extendsoop.compare.MyCompareble;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrays {
    public static Comparator<Object> comparator;

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

    public static void mySort(Object[] arr, Comparator<Object> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(comparator.compare(arr[i], arr[j])==1){
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void mySort1(Object[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(MyArrays.comparator.compare(arr[i], arr[j])==1){
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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

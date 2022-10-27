package com.codegym.basic.extendsoop.compare.designpattern.template;

public class MyArrays {
    public static void sort(Object[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length; j++) {
                Comparable c1 = (Comparable)a[i];
                Comparable c2 = (Comparable)a[i];
                if(c1.compareTo(c2)>0){
                    swap(a[i],a[j]);
                }
            }
        }
    }

    private static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
}

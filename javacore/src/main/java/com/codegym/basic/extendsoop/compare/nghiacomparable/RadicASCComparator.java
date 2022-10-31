package com.codegym.basic.extendsoop.compare.nghiacomparable;

import com.codegym.basic.extendsoop.compare.Circle;

import java.util.Comparator;

public class RadicASCComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {

        Circle c1 = (Circle) o1;
        Circle c2 = (Circle) o2;
         if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 1;
    }
}

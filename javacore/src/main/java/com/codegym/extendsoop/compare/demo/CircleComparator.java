package com.codegym.extendsoop.compare.demo;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

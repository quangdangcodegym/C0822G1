package com.codegym.sort.comparator;

import com.codegym.sort.Animal;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Animal animal1 = (Animal) o1;
        Animal animal2 = (Animal) o2;
        if (animal1.getWeight() > animal2.getWeight()) {
            return 1;
        }else {
            if (animal1.getWeight() == animal2.getWeight()) {
                return 0;
            }
            else
                return -1;
        }
    }
}

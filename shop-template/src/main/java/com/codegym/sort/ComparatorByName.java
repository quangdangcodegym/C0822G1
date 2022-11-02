package com.codegym.sort;

import com.codegym.model.Product;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getName().compareTo(o2.getName())>0){
            return 1;
        }else {
            if(o1.getName().compareTo(o2.getName())==0)
                return 0;
            else
                return -1;
        }
        // return o1.getName().compareTo(o2.getName());
    }
}

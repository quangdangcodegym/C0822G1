package com.codegym.basic.myarraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Map<Integer, String> map = new HashMap<>();
////        Map<Integer, String> map1 = new LinkedHashMap<>();
//        map.put(1, "Nghia");
//        map.put(2, "Thien");
//        map.put(3, "Nhan");

//        Set<Map.Entry<Integer, String>> sets = map.entrySet();
//        for (int i = 0; i < sets.size(); i++) {
////            Map.Entry<Integer, String> item = setsget
//        }
//        for (Map.Entry<Integer, String> item: sets ) {
//            System.out.println(item.getKey() + " value: " + item.getValue());
//        }

//        ArrayList<String> a = new ArrayList<>();
//        a.add("Nhan");
//        Iterator<Map.Entry<Integer, String>> iterators = sets.iterator();
//        while (iterators.hasNext()) {
//            Map.Entry<Integer, String> item = iterators.next();
//            System.out.println(item.getKey() + " : " + item.getValue());

        Circle c = new Circle(6);
        Circle c1 = (Circle) c.clone();

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c1.getRadius());
    }
}

package com.codegym.myarraylist;

import java.util.*;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size -1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
    public void remove(E obj){

    }

    public int get(Object obj) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {

//        Set<Circle> list = new HashSet<>();
//        list.add(new Circle(6));
//        list.add(new Circle(7));
//        list.add(new Circle(9));
//        list.add(new Circle(6));
//        System.out.println("---------");
//        Set<Integer> sets = new HashSet<>();
//        sets.add(1);
//        sets.add(4);
//        sets.add(1);
//        System.out.println(sets);

//        Map<Integer, String> mapC08 = new HashMap<>();
//        mapC08.put(1, "Thien");
//        mapC08.put(5, "Hoang");
//        mapC08.put(3, "Yen");
//        mapC08.put(5, "Nguyen");
//
//        System.out.println(mapC08);
//        Map<Circle, String> mapCircles = new HashMap<>();
//        mapCircles.put(new Circle(7), "BK 7");
//        mapCircles.put(new Circle(8), "BK 8");
//        mapCircles.put(new Circle(9), "BK 9");
//
//        Circle c = new Circle(7);
//        System.out.println(mapCircles.get(c));
//        MyList<Circle> listCircles = new MyList<>();
//        listCircles.add(new Circle(6));
//        listCircles.add(new Circle(7));
//        listCircles.add(new Circle(8));
//        listCircles.add(new Circle(9));
//        listCircles.add(new Circle(10));
//
//        Circle c = new Circle(8);
//        System.out.println(listCircles.get(c));
//       MyList<Integer> listInteger = new MyList<Integer>();
//
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//
//        listInteger.get(4);

//        System.out.println("element 4: "+listInteger.get(4));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
//
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));


//        ArrayList<String> listC8 = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//
//        Collection<Double> arr1 = new Vector<>();

    }
}

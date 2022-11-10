package com.codegym.model;

public enum EnumManufacturer {
    APPLE("Apple", 1),
    SAMSUNG("Samsung", 2),
    NOKIA("Nokia", 3);


    private String name;
    private int id = -1;
    private EnumManufacturer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }


    //https://www.programiz.com/java-programming/enum-constructor
    public static void main(String[] args) {
        EnumManufacturer size = EnumManufacturer.APPLE;
        System.out.println(size.getId());
        System.out.println(size.getName());
        System.out.println(size);
        for (EnumManufacturer e : EnumManufacturer.values()) {
            System.out.println(e.getId() + " : " + e.getName());
        }
    }
}

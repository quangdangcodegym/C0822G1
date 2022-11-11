package com.codegym.model;

public enum EnumManufacturer {
    APPLE(1, "Apple"),
    SAMSUNG(2, "Samsung"),
    SONY(3, "Sony"),
    NOKIA(4, "Nokia");
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private EnumManufacturer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        for(EnumManufacturer enumManufacturer : EnumManufacturer.values()){
            System.out.println("ID: " + enumManufacturer.getId() + " Name: " + enumManufacturer.getName());
        }
    }

//    //https://www.programiz.com/java-programming/enum-constructor
//    public static void main(String[] args) {
//        com.codegym.stroge.EnumManufacturer size = com.codegym.stroge.EnumManufacturer.APPLE;
//        System.out.println(size.getId());
//        System.out.println(size.getName());
//        System.out.println(size);
//        for (com.codegym.stroge.EnumManufacturer e : com.codegym.stroge.EnumManufacturer.values()) {
//            System.out.println(e.getId() + " : " + e.getName());
//        }
//    }
}

package com.codegym.utils;


import com.codegym.model.EnumManufacturer;

public class Helper {
    public static EnumManufacturer findById(int id) {
        for (EnumManufacturer e : EnumManufacturer.values()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}

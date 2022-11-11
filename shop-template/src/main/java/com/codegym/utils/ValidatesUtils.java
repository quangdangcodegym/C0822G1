package com.codegym.utils;

import java.util.regex.Pattern;

public class ValidatesUtils {
    private static final String PATTERN_VALIDATE_NAME = "^[A-Z].{1,9}$";

    public static boolean validateNameProduct(String name) {
        return Pattern.compile(PATTERN_VALIDATE_NAME).matcher(name).matches();
    }
}

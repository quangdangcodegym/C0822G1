package com.codegym.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateUtils {
    private static String pattern = "MM-dd-yyyy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public static String formatDateToString(Date dateUtils) {
        return simpleDateFormat.format(dateUtils);
    }
    public static String formatInstanstToString(Instant dateInstants){
        return simpleDateFormat.format(Date.from(dateInstants));
    }
}

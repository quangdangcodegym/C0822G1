package com.codegym.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
    private static String PATTERN_FORMAT_DATE = "MM-dd-yyyy HH:mm:ss";

    private static final String PATTERN_FORMAT_INSTANT = "MM-dd-yyyy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_FORMAT_DATE);
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN_FORMAT_INSTANT)
            .withZone(ZoneId.systemDefault());


    public static String formatDateToString(Date dateUtils) {
        return simpleDateFormat.format(dateUtils);
    }
    public static String formatInstanstToString(Instant dateInstants){
        return dateTimeFormatter.format(dateInstants);
    }

    public static Date parseStringToDate(String date) {
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Instant parseStringToInstant(String date) {
        return Instant.from(dateTimeFormatter.parse(date));
    }


}

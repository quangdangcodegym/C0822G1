package utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateUtils {
    private static String pattern = "MM-dd-yy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public static String formatDateToString(Date dateUtils){
        return simpleDateFormat.format(dateUtils);
    }

    public static String formatInstantToString(Instant dateInstant){
        return simpleDateFormat.format(Date.from(dateInstant));
    }
}

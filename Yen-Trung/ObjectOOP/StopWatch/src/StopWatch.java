import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StopWatch {
    public String getNowTime(){
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSS");
        String formattedDateTime = currentLocalDateTime.format(dateTimeFormatter);
        return formattedDateTime;
    }
    public String getElapsedTime(){
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ss");
        String formattedDateTime = currentLocalDateTime.format(dateTimeFormatter);
        return formattedDateTime;
    }
}

package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtilities {
    public static String tomorrow(){
        LocalDate tomorrow= LocalDate.now().plusDays(1);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return tomorrow.format(dateTimeFormatter);



    }
    public static String currentTime(){
        LocalTime time=LocalTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(timeFormatter);
    }
}

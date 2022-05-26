

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class date{
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
    
}

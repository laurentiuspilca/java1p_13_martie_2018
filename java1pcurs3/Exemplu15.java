import java.time.*;

public class Exemplu15 {

    public static void main(String [] args) {
        
        ZoneId zidBuc = ZoneId.of("Europe/Bucharest");
        ZoneId zidLon = ZoneId.of("Europe/London");
        
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(zidLon);
        
        LocalDateTime ldt1 = LocalDateTime.now();
        
        ZonedDateTime zdt3 = ZonedDateTime.of(ldt1, zidBuc);
        ZonedDateTime zdt4 = ZonedDateTime.of(ldt1, zidLon);
        
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);
        System.out.println(zdt4);
    }
}
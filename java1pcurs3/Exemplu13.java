import java.time.*;

public class Exemplu13 {

    public static void main(String [] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        
        LocalDateTime ldt2 = LocalDateTime.of(2018, 11, 20, 10, 45);
        LocalDateTime ldt3 = LocalDateTime.of(2018, Month.NOVEMBER, 20, 10, 45);
        
        LocalDate ld1 = LocalDate.of(2018, 1, 20);
        LocalTime lt1 = LocalTime.of(10, 45);
        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1); // 2018-01-20T10:45
        
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        
    }
}
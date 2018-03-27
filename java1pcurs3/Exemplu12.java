import java.time.*;

public class Exemplu12 {

    public static void main(String [] args) {
        LocalDate ld1 = LocalDate.now();
        
        LocalDate ld2 = LocalDate.of(2018, 1, 20); // an luna zi
        LocalDate ld3 = LocalDate.of(2018, Month.JANUARY, 20);
        
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3); // 2018-01-20
        
        LocalDate ld4 = ld3.plusDays(10);
        LocalDate ld5 = ld3.minusYears(10);
        
        boolean r1 = ld4.isAfter(ld5);
        boolean r2 = ld4.isBefore(ld5);
        boolean r3 = ld4.isEqual(ld5);
    }
}
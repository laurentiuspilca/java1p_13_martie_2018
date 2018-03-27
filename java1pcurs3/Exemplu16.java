import java.time.*;

public class Exemplu16 {

    public static void main(String [] args) {
        Duration d1 = Duration.ofHours(10);
        Duration d2 = Duration.ofDays(10); // PT240H
        
        System.out.println(d1);
        System.out.println(d2);
        
        Period p1 = Period.ofDays(10);
        System.out.println(p1); // P10D
    }
}
import java.time.*;

public class Exemplu11 {

    public static void main(String [] args) {
        LocalTime lt1 = LocalTime.now();
        
        LocalTime lt2 = LocalTime.of(10, 45);
        LocalTime lt3 = LocalTime.of(10, 45, 10);
        LocalTime lt4 = LocalTime.of(10, 45, 10, 123456789);
        
        System.out.println(lt1); // 8:06:50.65465465
        System.out.println(lt2); // 10:45
        System.out.println(lt3); // 10:45:10
        System.out.println(lt4); // 10:45:10.12345679
        
        LocalTime lt5 = lt2.plusMinutes(10);
        LocalTime lt6 = lt2.minusMinutes(10);
        
        boolean r1 = lt5.isBefore(lt6);
        boolean r2 = lt5.isAfter(lt6);
        boolean r3 = lt5.equals(lt6);
    }
}
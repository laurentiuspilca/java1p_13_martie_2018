import java.util.stream.*;

public class Exemplu9 {

    public static void main(String [] args) {
        boolean r1 = Stream.of(2,3,4,5,6).anyMatch(x -> x % 2 == 0);
        boolean r2 = Stream.of(2,3,4,5,6).allMatch(x -> x % 2 == 0);
        boolean r3 = Stream.of(2,3,4,5,6).noneMatch(x -> x % 2 == 0);
        
        
        System.out.println(r1); // true
        System.out.println(r2); // false
        System.out.println(r3); // false
    }
}
import java.util.stream.*;
import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        Random r = new Random();
        
        Stream.generate(() -> r.nextInt(1000))
              .limit(10)
              .forEach(System.out::println);
    }
}
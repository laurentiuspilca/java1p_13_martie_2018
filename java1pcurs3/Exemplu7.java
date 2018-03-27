import java.util.stream.*;

public class Exemplu7 {
    
    public static void main(String [] args) {
        Stream.of("HELLO", "WORLD")
              .map(s -> s.length())
              .forEach(System.out::println);
    }
}
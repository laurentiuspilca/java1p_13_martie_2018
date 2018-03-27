import java.util.stream.*;

public class Exemplu8 {

    public static void main(String [] args) {
        int sum = Stream.of("HELLO", "WORLD")
                        .mapToInt(String::length) // s -> s.length()
                        .sum();
                        
        System.out.println(sum);                
    }
}
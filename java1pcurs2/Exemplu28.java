import java.util.stream.*;
import java.util.*;

public class Exemplu28 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "my", "friend");
        
        int sum = 
            list.stream()
                .map(s -> s.length())
                .filter(n -> n % 2 == 0)
                //.forEach(n -> System.out.println(n));
                .reduce(0, (a,b) -> a+b);
                
        System.out.println(sum);        
    }
}
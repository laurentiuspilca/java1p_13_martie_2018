import java.util.stream.*;
import java.util.*;

public class Exemplu29 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "my", "friend");
        
        list.stream()
            .map(s -> new StringBuilder(s).reverse())
            .forEach(s -> System.out.println(s));
    }
}
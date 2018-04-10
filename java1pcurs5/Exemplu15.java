import java.util.stream.*;
import java.util.*;

public class Exemplu15 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        
        list.stream()
            .parallel()
            .forEachOrdered(System.out::println);
    }
}
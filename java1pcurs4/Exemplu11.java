import java.util.*;
import java.util.stream.*;

public class Exemplu11 {
    public static void main(String[] ars) {
        List<String> list = Arrays.asList("aaaa", "b", "cc", "dddd", "ee", "fffff");
        /*
         4 - "aaaa,dddd"
         2 - "cc,ee"
         1 - "b"
         5 - "fffff"
         */
        Map<Integer, String> map = list.stream()
                                                .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
        System.out.println(map);                                        
    }
}
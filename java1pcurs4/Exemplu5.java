import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("aaa", "bb", "c", "dddd"));
        list.add(Arrays.asList("eeee", "ee", "e", "eeeeee"));
        list.add(Arrays.asList("fffff", "ggg", "hh"));
        List<Integer> values = list.stream() // stream de liste
                                    .flatMap(l -> l.stream()) // stream de String
                                    .map(s -> s.length()) // stream de Integer
                                    .distinct()
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println(values);                            
                                    
    }
}
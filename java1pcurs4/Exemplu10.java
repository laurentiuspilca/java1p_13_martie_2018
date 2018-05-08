import java.util.*;
import java.util.stream.*;

public class Exemplu10 {
    public static void main(String[] args) {
        List<Produs> produse = Arrays.asList(new Produs("p1", 10),
                                             new Produs("p2", 20),
                                             new Produs("p3", 10),
                                             new Produs("p4", 20));
        Map<Integer, List<Produs>> map = produse.stream()
                                                .collect(Collectors.groupingBy(p -> p.pret));
    
        System.out.println(map);                                    
    }
}
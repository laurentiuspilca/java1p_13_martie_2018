import java.util.*;

public class Exemplu13 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.empty();
        String s = "Hello";
        Optional<String> o2 = Optional.of(s);
        Optional<String> o3 = Optional.ofNullable(s);
        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
        o1.ifPresent(System.out::println);
        o2.filter(s1 -> s1.length() % 2 == 0).ifPresent(System.out::println);
        o2.map(s2 -> s2.length()).ifPresent(System.out::println);
        String x = o2.get();
        String y = o2.orElse("World!");
    }
}
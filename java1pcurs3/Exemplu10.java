import java.util.stream.*;

public class Exemplu10 {

    public static void main(String [] args) {
        Stream.of(1,3,5,3,7,3,5,10)
              .distinct()
              .forEach(System.out::println);
    }
}
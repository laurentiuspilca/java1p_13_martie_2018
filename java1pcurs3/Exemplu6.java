import java.util.stream.*;

public class Exemplu6 {

    public static void main(String [] args) {
        int sum = Stream.of(3,4,5,6).mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
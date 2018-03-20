import java.nio.file.*;

public class Exemplu34 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu30.java");
            int sum = Files.lines(p1)
                 .map (s -> s.length())
                 //.forEach(n -> System.out.println(n));
                 .reduce(0, (a,b) -> a+b);
                 
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.nio.file.*;

public class Exemplu30 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu30.java");
            Files.lines(p1)
                .filter(s -> s.length() % 2 == 0)
                .map(s -> new StringBuilder(s).reverse())
                .forEach(s -> System.out.println(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.nio.file.*;

public class Exemplu32 {

    public static void main(String [] args) {
        Path p = Paths.get("D:\\Java 1 P 13 Martie");
        
        try {
            Files.walk(p, 10)
                 .filter(x -> x.toString().endsWith(".java"))
                 .filter(x -> !x.toString().contains("Exemplu"))
                 .forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
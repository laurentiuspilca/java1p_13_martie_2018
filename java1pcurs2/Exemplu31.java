import java.nio.file.*;

public class Exemplu31 {

    public static void main(String [] args) {
        Path p = Paths.get("./");
        
        try {
            Files.list(p)
                 .filter(x -> x.toString().endsWith(".java"))
                 .forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
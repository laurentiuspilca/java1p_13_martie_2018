import java.nio.file.*;

public class Exemplu12 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/C");
        Path p2 = Paths.get("R/T/G");
        
        Path p3 = p2.resolve(p1);
        
        System.out.println(p3);
    }
}
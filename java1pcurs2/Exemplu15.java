import java.nio.file.*;

public class Exemplu15 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/../B/./././E/./../C");
        Path p2 = Paths.get("R/T/G");
        
        Path p3 = p1.resolve(p2);
        
        System.out.println(p3);
    }
}
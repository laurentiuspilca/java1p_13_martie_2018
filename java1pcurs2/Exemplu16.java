import java.nio.file.*;

public class Exemplu16 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D");
        Path p2 = Paths.get("C:/A/B/M/N");
        
        Path p3 = p1.relativize(p2);
        
        System.out.println(p3);
    }
}
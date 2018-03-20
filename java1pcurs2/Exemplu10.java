import java.nio.file.*;

public class Exemplu10 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D/E/F/G/H");
        
        Path p2 = p1.subpath(2,5); // C/D/E
        
        System.out.println(p2);
    }
}
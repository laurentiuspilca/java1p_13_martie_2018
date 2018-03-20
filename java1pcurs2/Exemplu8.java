import java.nio.file.*;

public class Exemplu8 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D");
        Path p2 = Paths.get("A/B/C/D/E");
        
        System.out.println(p1.getRoot()); // C:/
        System.out.println(p2.getRoot()); // null
        
        System.out.println(p1.getParent());
        System.out.println(p2.getParent());
        
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
    }
}
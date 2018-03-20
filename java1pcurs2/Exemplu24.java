import java.nio.file.*;

public class Exemplu24 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("A/B/C/D");
            Path p2 = Paths.get("A/B/C/F");
            
            boolean r = Files.isSameFile(p1,p2);
            
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
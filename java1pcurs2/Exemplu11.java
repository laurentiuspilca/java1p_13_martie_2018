import java.nio.file.*;

public class Exemplu11 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/.././././../E/R/D/./../W/../Q");
        
        // C:/E/R/Q
        
        Path p2 = p1.normalize();
        
        System.out.println(p2);
    }
}
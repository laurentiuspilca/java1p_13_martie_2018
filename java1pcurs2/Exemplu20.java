import java.nio.file.*;

public class Exemplu20 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("A");
            Files.createDirectory(p1); // Files.createDirectories(p1)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
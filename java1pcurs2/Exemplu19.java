import java.nio.file.*;

public class Exemplu19 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("exemplu.txt");
            Files.createFile(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
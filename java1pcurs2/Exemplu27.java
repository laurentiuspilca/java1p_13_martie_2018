import java.nio.file.*;

public class Exemplu27 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu27.java");
        try {
            byte [] content = Files.readAllBytes(p1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
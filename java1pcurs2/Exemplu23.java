import java.nio.file.*;

public class Exemplu23 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu23.java");
            System.out.println(Files.isDirectory(p1)); // false
            System.out.println(Files.isRegularFile(p1)); // true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
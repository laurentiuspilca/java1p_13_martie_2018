import java.nio.file.*;
import java.util.*;

public class Exemplu26 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu26.java");
        try {
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(p -> System.out.println(p));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
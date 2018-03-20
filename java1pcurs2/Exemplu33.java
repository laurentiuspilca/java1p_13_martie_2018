import java.nio.file.*;
import java.nio.file.attribute.*;

public class Exemplu33 {

    public static void main(String [] args) {
        Path p = Paths.get("D:\\Java 1 P 13 Martie");
        
        try {
            Files.find(p, 10, (x, a) -> condition(x, a))
                 .map(x -> new StringBuilder(x.toString()).reverse())
                 .forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static boolean condition(Path x, BasicFileAttributes a) {
        return  a.size() > 1000 && 
                x.toString().endsWith(".java") && 
                !x.toString().contains("Exemplu");
    }
}
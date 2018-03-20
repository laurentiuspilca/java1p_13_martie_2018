import java.nio.file.*;

public class Exemplu22 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("A");
            //Files.delete(p1);
            boolean res = Files.deleteIfExists(p1);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.nio.file.*;
import java.io.*;

public class Exemplu18 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A");
        File f1 = p1.toFile();
        Path p2 = f1.toPath();
    }
}
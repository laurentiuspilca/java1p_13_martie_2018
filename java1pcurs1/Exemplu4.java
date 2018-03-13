import java.io.*;
import java.util.*;

public class Exemplu4 {

    public static void main(String [] args) {
        try (PrintStream out = new PrintStream("numere.txt")) {
            Random r = new Random();
            
            for (int i=0; i<10; i++) {
                out.println(r.nextInt(1000));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
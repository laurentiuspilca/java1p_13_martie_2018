import java.io.*;

public class Exemplu3 {

    public static void main(String [] args) {
        try (PrintStream out = new PrintStream("exemplu.txt")) {
            out.println("Hello World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
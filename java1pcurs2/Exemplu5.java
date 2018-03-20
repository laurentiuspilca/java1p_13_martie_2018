import java.io.*;

public class Exemplu5 {

    public static void main(String [] args) {
        try {
            File f = new File("A");
            f.delete(); // fisiere sau foldere goale
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
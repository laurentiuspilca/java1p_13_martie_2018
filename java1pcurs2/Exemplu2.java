import java.io.*;

public class Exemplu2 {

    public static void main(String [] args) {
        try {
            File f = new File("B/C/D");
            
            boolean res = f.mkdirs(); // f.mkdir()
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
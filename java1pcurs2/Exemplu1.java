import java.io.*;

public class Exemplu1 {

    public static void main(String [] args) {
        try {
            File f = new File("fisier.txt");
            
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
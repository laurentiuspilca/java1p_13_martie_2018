import java.io.*;

public class Exemplu4 {

    public static void main(String [] args) {
        try {
            File f = new File("C:/");
            File [] names = f.listFiles();
            
            for (File n : names) {
                System.out.println(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
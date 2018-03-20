import java.io.*;

public class Exemplu3 {

    public static void main(String [] args) {
        try {
            File f = new File("C:/");
            String [] names = f.list();
            
            for (String n : names) {
                System.out.println(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
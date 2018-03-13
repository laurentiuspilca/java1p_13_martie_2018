import java.io.*;

public class Exemplu10 {

    public static void main(String [] args) {
        C c = new C();
        
        try (
            FileOutputStream fos = new FileOutputStream("c");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
            out.writeObject(c);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
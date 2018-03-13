import java.io.*;

public class Exemplu7 {

    public static void main(String [] args) {
        Pisica p1 = new Pisica("Tom", "negru");
        
        try (
            FileOutputStream fos = new FileOutputStream("pisica");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
            out.writeObject(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
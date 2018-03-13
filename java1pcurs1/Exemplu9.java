import java.io.*;

public class Exemplu9 {

    public static void main(String [] args) {
        try (
            FileOutputStream fos = new FileOutputStream("cerc");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
            Punct p = new Punct();
            Cerc c = new Cerc(p, 10);
            
            out.writeObject(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
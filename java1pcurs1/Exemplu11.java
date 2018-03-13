import java.io.*;

public class Exemplu11 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("c");
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            C c = (C) in.readObject();
            // putem sa folosim pe c
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
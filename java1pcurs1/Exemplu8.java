import java.io.*;

public class Exemplu8 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("pisica");
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            Pisica p1 = (Pisica) in.readObject();
            
            System.out.println(p1.nume + " " + p1.culoare);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
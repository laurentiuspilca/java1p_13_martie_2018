import java.io.*;

public class Exemplu13 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("d");
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            D d = (D) in.readObject();
            
            //do smth with d
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
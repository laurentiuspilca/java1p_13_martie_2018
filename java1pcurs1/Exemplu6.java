import java.io.*;

public class Exemplu6 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("numere.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader in = new BufferedReader(isr)
        ) {
            String line;
            int sum = 0;
            while ( (line = in.readLine()) != null ) {
                sum += Integer.parseInt(line);
            }
            System.out.println("SUMA: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
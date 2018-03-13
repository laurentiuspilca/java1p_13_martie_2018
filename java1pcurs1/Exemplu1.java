import java.io.*;


public class Exemplu1 {
    
    public static void main(String [] args) {
        
        System.out.print("Sir: ");
        
        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
        ) {
            String line = in.readLine();
            
            StringBuilder sb = new StringBuilder(line);
            System.out.println(sb.reverse());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
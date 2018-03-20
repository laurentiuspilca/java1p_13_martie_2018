import java.io.*;

public class Exemplu6 {

    public static void main(String [] args) {
        try {
            File f = new File("B");
            deleteFolder(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void deleteFolder(File f) {
        if (!f.isFile()) {
            File [] content = f.listFiles();
            for (File c : content) {
                deleteFolder(c);
            }
        } 
            
        f.delete();
    }
}
public class Exemplu14 {
    public static void main(String[] args) {
        OddNumbersThread t = new OddNumbersThread();
        t.start();
        
        EvenNumbersRunnable r = new EvenNumbersRunnable();
        Thread t2 = new Thread(r);
        t2.start();
        
        System.out.println("THE END.");
    }
}
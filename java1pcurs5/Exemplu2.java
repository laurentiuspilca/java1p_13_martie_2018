import java.util.concurrent.*;

public class Exemplu2 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);
        
        service.execute(
            () -> System.out.println(
                Thread.currentThread().getName() + " Hello"));
        
        service.shutdown(); // service.shutdownNow()
    }
}
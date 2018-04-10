import java.util.concurrent.*;

public class Exemplu1 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        service.execute(
            () -> System.out.println(
                Thread.currentThread().getName() + " Hello"));
        
        service.shutdown(); // service.shutdownNow()
    }
}
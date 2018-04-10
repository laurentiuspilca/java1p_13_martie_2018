import java.util.concurrent.*;

public class Exemplu5 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);
        
        Future<String> f = service.submit(() -> "PIZZA");
        // intre timp
        try {
            String pizza = f.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown(); // service.shutdownNow()
    }
}
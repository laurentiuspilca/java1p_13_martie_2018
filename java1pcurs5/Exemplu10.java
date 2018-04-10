import java.util.concurrent.*;
import java.util.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(54,56,7,4,2,43,5,7,5,3,2,4,6,7,5,3,2);
        
        ForkJoinPool pool = new ForkJoinPool();
        ListSumTask task = new ListSumTask(list);
        
        int suma = pool.invoke(task);
        System.out.println(suma);
    }
}
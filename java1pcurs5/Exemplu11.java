import java.util.concurrent.*;
import java.util.*;

public class Exemplu11 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        DisplayNumbersAction a1 = new DisplayNumbersAction(list);
        
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(a1);
    }
}
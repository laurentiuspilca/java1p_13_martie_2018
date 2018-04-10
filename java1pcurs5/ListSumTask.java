import java.util.concurrent.*;
import java.util.*;

public class ListSumTask extends RecursiveTask<Integer> {

    private List<Integer> list;
    
    public ListSumTask(List<Integer> list) {
        this.list = list;
    }
    
    @Override
    public Integer compute() {
        if (list.size() <= 3) {
            return list.stream().reduce(0, (a,b) -> a+b);
        }
        
        int mid = list.size() / 2;
        
        List<Integer> list1 = list.subList(0, mid);
        List<Integer> list2 = list.subList(mid, list.size());
        
        ListSumTask task1 = new ListSumTask(list1);
        ListSumTask task2 = new ListSumTask(list2);
        
        task2.fork();
        
        return task1.compute() + task2.join();
    }
}
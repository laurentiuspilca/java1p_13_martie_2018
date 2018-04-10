import java.util.concurrent.*;
import java.util.*;

public class DisplayNumbersAction extends RecursiveAction {

    private List<Integer> list;
    
    public DisplayNumbersAction(List<Integer> list) {
        this.list = list;
    }
    
    @Override
    public void compute() {
        if (list.size() <= 3) {
            list.forEach(System.out::println);
            return;
        }
        
        int mid = list.size() / 2;
        List<Integer> list1 = list.subList(0, mid);
        List<Integer> list2 = list.subList(mid, list.size());
        
        DisplayNumbersAction a1 = new DisplayNumbersAction(list1);
        DisplayNumbersAction a2 = new DisplayNumbersAction(list2);
        
        invokeAll(a1,a2);
    }
}

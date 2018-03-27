import java.util.function.*;

public class Exemplu2 {

    public static void main(String [] args) {
        Consumer<Integer> c1 = x -> System.out.println(x);
        Consumer<Integer> c2 = System.out::println;
        
        c1.accept(10);
        
        Supplier<Integer> s1 = () -> 4;
        int x = s1.get();
        System.out.println(x); // 4
        
        BiConsumer<Integer, String> c3 = 
            (a,b) -> System.out.println(a + " " + b);
            
        c3.accept(3, "Hello"); 
        
        Predicate<Integer> p1 = w -> w % 2 == 0;
        boolean res1 = p1.test(10);
        System.out.println(res1); // true
        
        BiPredicate<String, Integer> p2 = (a,b) -> a.length() == b;
        boolean res2 = p2.test("HELLO", 4);
        System.out.println(res2); // false
        
        Function<String, Integer> f1 = w -> w.length();
        Integer q = f1.apply("HELLO");
        System.out.println(q); // 5
        
        BiFunction<Integer, String, String> f2 = (a,b) -> a + b;
        System.out.println(f2.apply(5, " mere are Ana")); // 5 mere are Ana
        
        Function<String, String> f3 = 
            w -> new StringBuilder(w).reverse().toString();
            
        UnaryOperator<String> u1 = 
            w -> new StringBuilder(w).reverse().toString(); 
        System.out.println(u1.apply("HELLO")); // OLLEH    
            
        BiFunction<Integer, Integer, Integer> f4 = (a,b) -> a*b; 
        
        BinaryOperator<Integer> b1 = (a,b) -> a*b; 
        Integer res3 = b1.apply(3,2);
        System.out.println(res3); // 6
    }
}
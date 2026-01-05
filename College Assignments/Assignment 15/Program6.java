
// Write a Java program to demonstrate the use of thread-safe collections
// such as ConcurrentHashMap and CopyOnWriteArrayList. Show how
// these collections can be used safely in a multithreaded environment.
import java.util.concurrent.*;

public class Program6 {
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable task = () -> {
            map.put(1, "Java");
            map.put(2, "Python");
            list.add(Thread.currentThread().getName());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Map: " + map);
        System.out.println("List: " + list);
    }
}

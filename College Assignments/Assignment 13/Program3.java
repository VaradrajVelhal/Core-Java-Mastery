
//Write a Java program to use concurrent collections such as
//ConcurrentHashMap and CopyOnWriteArrayList to safely manage shared
//data between threads.
import java.util.concurrent.*;

public class Program3 {
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable task1 = () -> {
            map.put(1, "Java");
            map.put(2, "Python");
            list.add("Thread-1");
        };

        Runnable task2 = () -> {
            map.put(3, "C++");
            list.add("Thread-2");
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Map: " + map);
        System.out.println("List: " + list);
    }
}

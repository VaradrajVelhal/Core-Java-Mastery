//Write a Java program to synchronize access to a shared resource (e.g., a
//counter) using the synchronized keyword. Create multiple threads that
//increment the counter and ensure that the increments are performed safely
class Counter {
    int count = 0;

    synchronized void counterIncre() {
        count++;
    }
}

public class Program9 {
    public static void main(String[] args) throws Exception {
        Counter c1 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.counterIncre();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.counterIncre();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final value of counter = " + c1.count);
    }
}

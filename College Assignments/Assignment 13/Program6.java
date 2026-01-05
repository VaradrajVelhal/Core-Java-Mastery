
//Write a Java program to use CountDownLatch to coordinate the
//completion of multiple threads. Create a scenario where the main thread
//waits for a specified number of worker threads to finish their tasks.
import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    CountDownLatch latch;

    Worker(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        System.out.println(getName() + " finished work");
        latch.countDown(); // decrease count
    }
}

public class Program6 {
    public static void main(String[] args) throws Exception {

        CountDownLatch latch = new CountDownLatch(3); // 3 worker threads

        new Worker(latch, "Worker-1").start();
        new Worker(latch, "Worker-2").start();
        new Worker(latch, "Worker-3").start();

        latch.await(); // main thread waits
        System.out.println("All workers completed. Main thread continues.");
    }
}


// Write a Java program to use CyclicBarrier to synchronize multiple threads at a common barrier point. Create a scenario where threads perform a task and wait at the barrier before proceeding.
import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    CyclicBarrier barrier;

    Worker(CyclicBarrier barrier, String name) {
        super(name);
        this.barrier = barrier;
    }

    public void run() {
        try {
            System.out.println(getName() + " finished task");
            barrier.await(); // wait at barrier
            System.out.println(getName() + " passed the barrier");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Program7 {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached barrier\n"));

        new Worker(barrier, "Thread-1").start();
        new Worker(barrier, "Thread-2").start();
        new Worker(barrier, "Thread-3").start();
    }
}

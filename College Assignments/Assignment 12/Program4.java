//Write a Java program to set and display the priority of different threads.
//Create multiple threads with different priorities and observe their
//execution order.
class Priority extends Thread {
    Priority(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Threads name is " + getName() + " And Priority is " + getPriority());
    }
}

public class Program4 {
    public static void main(String[] args) {
        Priority p1 = new Priority("1st");
        Priority p2 = new Priority("2nd");
        Priority p3 = new Priority("3rd");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
    }
}

//Write a Java program to demonstrate the use of Thread.join() to ensure
//that one thread waits for another thread to complete its execution before proceeding.

public class Program5 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("from thread 1 " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("from thred 2 " + i);
            }
        });
        t1.start();
        t1.join();
        t2.start();
    }
}

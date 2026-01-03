//Write a Java program to create a daemon thread that performs periodic
//tasks(e.g.,printing a message every second).Demonstrate how the daemon
//thread behaves when the main thread exits.
public class Program8 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("inside daemon");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(2000);
        System.out.println("main thread running operations ");
        System.out.println(1 + 1);
    }
}

//Write a Java program to display the state of a thread at different stages of
//its lifecycle (e.g., NEW, RUNNABLE, WAITING, TERMINATED). Use
//the Thread.getState() method to print the thread states.
class ThreadDemmo extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Program7 {
    public static void main(String[] args) throws Exception {
        ThreadDemmo t1 = new ThreadDemmo();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}

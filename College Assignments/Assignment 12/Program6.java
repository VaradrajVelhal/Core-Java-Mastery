//Write a Java program to create and start multiple threads that perform
//different tasks (e.g., printing numbers, letters, and symbols). Use both the
//Thread class and the Runnable interface
class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 97; i < 107; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Program6 {
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 p = new ThreadDemo2();
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

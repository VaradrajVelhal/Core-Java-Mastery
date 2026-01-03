// Write a Java program to demonstrate thread communication using wait()
//and notify().Create two threads where one thread produces data and the other thread consumes the data.

class Shared {
    int data;
    boolean ready = false;

    synchronized void produce(int x) throws Exception {
        if (ready)
            wait();
        data = x;
        System.out.println("Produced: " + data);
        ready = true;
        notify();
    }

    synchronized void consume() throws Exception {
        if (!ready)
            wait();
        System.out.println("Consumed: " + data);
        ready = false;
        notify();
    }
}

public class program10 {
    public static void main(String[] args) {

        Shared s = new Shared();

        new Thread(() -> {
            try {
                s.produce(1);
            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                s.consume();
            } catch (Exception e) {
            }
        }).start();
    }
}

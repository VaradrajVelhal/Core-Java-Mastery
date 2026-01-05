//Write a Java program to solve the producer-consumer problem using a
//shared buffer and synchronization. Implement both producer and
//consumer threads that interact with the buffer.
class Buffer {
    int item;
    boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        item = value;
        System.out.println("Produced: " + item);
        available = true;
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            b.produce(i);
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            b.consume();
    }
}

public class Program9 {
    public static void main(String[] args) {

        Buffer b = new Buffer();

        new Producer(b).start();
        new Consumer(b).start();
    }
}


//Write a Java program to demonstrate the use of Semaphore to control
//access to a limited resource. Create a scenario where multiple threads try
//to access a shared resource with limited permits.
import java.util.concurrent.Semaphore;

class Resource {

    Semaphore sem = new Semaphore(2); // only 2 permits

    void useResource(String name) {
        try {
            sem.acquire(); // request permit
            System.out.println(name + " accessing resource");
            Thread.sleep(1000); // using resource
            System.out.println(name + " leaving resource");
            sem.release(); // release permit
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User extends Thread {
    Resource r;

    User(Resource r, String name) {
        super(name);
        this.r = r;
    }

    public void run() {
        r.useResource(getName());
    }
}

public class Program5 {
    public static void main(String[] args) {

        Resource r = new Resource();

        new User(r, "Thread-1").start();
        new User(r, "Thread-2").start();
        new User(r, "Thread-3").start();
        new User(r, "Thread-4").start();
    }
}

//Write a Java program to create a thread by implementing the Runnable
//interface. Implement the run() method and use a Thread object to execute
//the Runnable.
class InnerProgram2 implements Runnable {

    @Override
    public void run() {
        System.out.println("inside run method....");
    }
}

public class Program2 {
    public static void main(String[] args) {
        InnerProgram2 p = new InnerProgram2();
        Thread t = new Thread(p);
        t.start();
    }
}

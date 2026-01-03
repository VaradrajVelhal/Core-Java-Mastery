//Write a Java program to create a thread by extending the Thread class and
//overriding its run() method. Start the thread and print a message from
//within the run() method.
class Test extends Thread {
    @Override
    public void run() {
        System.out.println("inseide run method....");
        super.run();
    }
}

class Program1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println("inside main thread....");
    }
}
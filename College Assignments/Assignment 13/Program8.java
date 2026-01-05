//Write a Java program to demonstrate the use of ThreadLocal to maintain
//thread-specific data. Create a ThreadLocal variable and show how each
//thread maintains its own instance of the variable.
class Program8 {

    static ThreadLocal<Integer> tl = new ThreadLocal<>();

    public static void main(String[] args) {

        Runnable task = () -> {
            tl.set((int) (Math.random() * 100)); // set thread-specific value
            System.out.println(
                    Thread.currentThread().getName() +
                            " value = " + tl.get());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

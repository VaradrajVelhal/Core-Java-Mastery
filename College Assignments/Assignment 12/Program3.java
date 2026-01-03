//Write a Java program to demonstrate the use of Thread.sleep() to pause a
//thread for a specific duration. Create two threads where one thread prints
//numbers and the other prints letters, with a delay between each print.
public class Program3 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 26; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

// Write a Java program to create an ArrayDeque and use it as both a stack
// and a queue. Demonstrate the use of methods like push(), pop(), offer(),
// and poll().
import java.util.ArrayDeque;

public class Program8 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Using as Stack (LIFO)
        dq.push(10);
        dq.push(20);
        dq.push(30);

        System.out.println("Pop (Stack): " + dq.pop());

        // Using as Queue (FIFO)
        dq.offer(40);
        dq.offer(50);

        System.out.println("Poll (Queue): " + dq.poll());
    }
}

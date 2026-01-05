
// Write a Java program to create a TreeSet of Integer elements and sort the
// elements in ascending order. Demonstrate how TreeSet maintains a sorted
// order.
import java.util.TreeSet;

public class Program3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(90);
        ts.add(78);
        ts.add(60);
        ts.add(99);
        ts.add(10);

        System.out.println(ts);
    }
}
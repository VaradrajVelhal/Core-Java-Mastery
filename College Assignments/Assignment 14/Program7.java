// Write a Java program to create a PriorityQueue of Integer elements. Add
// elements to the queue and demonstrate how the queue orders elements
// based on their natural ordering.

import java.util.PriorityQueue;
import java.util.stream.Gatherer.Integrator;

public class Program7 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(8);
        pq.add(90);
        pq.add(1);
        pq.add(2);

        System.out.println(pq);
    }
}
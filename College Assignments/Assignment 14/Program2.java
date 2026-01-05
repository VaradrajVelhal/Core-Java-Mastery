// Write a Java program to create a LinkedList of Integer elements. Add and
// remove elements from the list and demonstrate the difference between
// ArrayList and LinkedList in terms of performance for these operations.

import java.util.ArrayList;
import java.util.LinkedList;

public class Program2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);// O(1)
        ll.add(2);
        ll.add(3);
        ll.add(3);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);// O(1)
        al.add(2);
        al.add(3);
        al.add(3);

        ll.remove(3);// O(1)
        al.remove(0);// O(n)
        System.out.println(ll);
        System.out.println(al);
    }
}
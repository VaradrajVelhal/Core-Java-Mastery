// Write a Java program to create an ArrayList of String elements. Add,
// remove, and retrieve elements from the list. Demonstrate various methods
// such as add(), remove(), get(), and size().

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Varadraj");
        al.add("Sunil");
        al.add("Nilesh");
        al.add("Vikash");

        System.out.println("Removing: " + al.remove(2));

        System.out.println("index no: 0 is = " + al.get(0));
        System.out.println(al.size());
        System.out.println(al);
    }
}
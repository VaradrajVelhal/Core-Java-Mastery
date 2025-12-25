//Write a Java program to use an external package like java.util. Demonstrate
//the usage of classes like ArrayList and HashMap from this package in your program.

import java.util.ArrayList;
import java.util.HashMap;

public class Program9 {
    public static void main(String[] args) {
        // 1. Using ArrayList (Dynamic Array)
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList: " + list);
        System.out.println("Item at index 1: " + list.get(1));

        // 2. Using HashMap (Key-Value Store)
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);

        System.out.println("\nHashMap: " + ages);
        System.out.println("Alice's Age: " + ages.get("Alice"));
    }
}
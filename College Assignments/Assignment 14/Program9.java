
// Write a Java program to demonstrate different ways to iterate over a List,
// Set, and Map. Use enhanced for loops, iterators, and lambda expressions
// for iteration.
import java.util.*;

public class Program9 {
    public static void main(String[] args) {

        // List
        List<String> list = Arrays.asList("Java", "Python", "C");

        System.out.println("List:");
        for (String s : list) // enhanced for
            System.out.println(s);

        Iterator<String> listIt = list.iterator(); // iterator
        while (listIt.hasNext())
            System.out.println(listIt.next());

        list.forEach(s -> System.out.println(s)); // lambda

        // Set
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));

        System.out.println("\nSet:");
        for (int i : set)
            System.out.println(i);

        Iterator<Integer> setIt = set.iterator();
        while (setIt.hasNext())
            System.out.println(setIt.next());

        set.forEach(i -> System.out.println(i));

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("\nMap:");
        for (Map.Entry<Integer, String> e : map.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());

        Iterator<Map.Entry<Integer, String>> mapIt = map.entrySet().iterator();
        while (mapIt.hasNext()) {
            Map.Entry<Integer, String> e = mapIt.next();
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + " = " + v)); // lambda
    }
}

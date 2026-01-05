// Write a Java program to create a HashMap with Integer keys and String
// values. Add key-value pairs to the map, retrieve values based on keys, and
// remove entries.

import java.util.HashMap;

public class Program4 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Varadraj");
        hm.put(2, "Sunil");
        hm.put(3, "Nilesh");
        hm.put(4, "Vikash");

        hm.remove(3);
        System.out.println(hm);
    }
}
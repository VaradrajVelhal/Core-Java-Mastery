// Write a Java program to create a LinkedHashMap and demonstrate how it
// maintains the insertion order of elements. Add entries to the map and
// iterate over them.

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Program6 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lsm = new LinkedHashMap<>();

        lsm.put(1, "Varadraj");
        lsm.put(5, "Sunil");
        lsm.put(3, "Nilesh");
        lsm.put(4, "Vikash");

        System.out.println(lsm);

        for (Entry<Integer, String> entry : lsm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
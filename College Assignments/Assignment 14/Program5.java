// Write a Java program to create a TreeMap with String keys and Double
// values. Display the map in sorted order based on keys.

import java.util.TreeMap;

public class Program5 {

    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Vadapav", 15.00);
        tm.put("Samosa", 18.00);
        tm.put("Pakoda", 35.00);
        tm.put("Maggi", 15.00);

        System.out.println(tm);
    }
}
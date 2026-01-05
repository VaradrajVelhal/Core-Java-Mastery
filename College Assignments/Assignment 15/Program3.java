
// Write a Java program to demonstrate the use of the Collections utility
// class. Use methods like sort(), shuffle(), reverse(), and binarySearch() on
// various collections.
import java.util.*;

public class Program3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 3, 2));

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.sort(list);
        int index = Collections.binarySearch(list, 3);
        System.out.println("Index of 3: " + index);
    }
}

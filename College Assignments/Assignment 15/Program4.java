
// Write a Java program to convert a List to a Set and vice versa. Use
// HashSet and ArrayList for the conversions and demonstrate how
// duplicates are handled in the conversion.
import java.util.*;

public class Program4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>(list);
        System.out.println("List to Set: " + set);

        List<Integer> newList = new ArrayList<>(set);
        System.out.println("Set to List: " + newList);
    }
}

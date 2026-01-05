
// Write a Java program to use lambda expressions for sorting a List of String
// objects. Demonstrate sorting by different criteria, such as string length and
// lexicographical order.
import java.util.*;

public class Program9 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "JavaScript"));

        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println("Lexicographical: " + list);

        Collections.sort(list, (a, b) -> a.length() - b.length());
        System.out.println("By Length: " + list);
    }
}

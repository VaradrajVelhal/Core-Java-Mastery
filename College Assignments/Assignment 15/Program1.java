
// Write a Java program to create a custom class Person that implements the
// Comparable interface. Sort a List<Person> based on a natural ordering of
// the Person objects.
import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Natural ordering based on age
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Program1 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Amit", 25));
        list.add(new Person("Ravi", 20));
        list.add(new Person("Neha", 22));

        Collections.sort(list); // uses compareTo()

        System.out.println("Sorted List:");
        for (Person p : list)
            System.out.println(p);
    }
}

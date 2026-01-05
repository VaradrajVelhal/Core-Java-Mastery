
// Write a Java program to use streams to perform complex operations on a
// collection. Create a list of objects, perform filtering, mapping, and
// reduction operations, and demonstrate the use of collect() to gather results.
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class program10 {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("Amit", 80),
                new Student("Ravi", 60),
                new Student("Neha", 90));

        List<String> names = list.stream()
                .filter(s -> s.marks > 70)
                .map(s -> s.name)
                .collect(Collectors.toList());

        int total = list.stream()
                .map(s -> s.marks)
                .reduce(0, Integer::sum);

        System.out.println("Filtered Names: " + names);
        System.out.println("Total Marks: " + total);
    }
}

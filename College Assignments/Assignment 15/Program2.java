
// Write a Java program to create a custom class Employee and implement a
// Comparator to sort a list of employees by their salary. Use
// Collections.sort() with the custom comparator.
import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class Program2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Amit", 50000));
        list.add(new Employee("Ravi", 30000));
        list.add(new Employee("Neha", 40000));

        Comparator<Employee> salaryComparator = (e1, e2) -> Double.compare(e1.salary, e2.salary);

        Collections.sort(list, salaryComparator);

        for (Employee e : list)
            System.out.println(e);
    }
}

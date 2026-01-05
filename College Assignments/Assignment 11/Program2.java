
//Write a Java program to deserialize an object from a file named person.ser 
//and print its attributes. Use ObjectInputStream for deserialization.
import java.io.*;

// The class must implement Serializable
class Person implements Serializable {
    String name;
    int age;
}

public class Program2 {
    public static void main(String[] args) {
        // We use try-with-resources to close the stream automatically
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p = (Person) ois.readObject();
            System.out.println(p.age);
            System.out.println(p.name);
        } catch (Exception e) {
            System.out.println("error occured...." + e);
        }
    }
}
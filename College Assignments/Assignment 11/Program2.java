
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
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {

            // Read object and cast it back to Person
            Person p = (Person) in.readObject();

            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);

        } catch (FileNotFoundException e) {
            System.out.println("File 'person.ser' not found. Serialize an object first!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}

//Write a Java program to serialize an object of a class Person with fields 
//name and age and write it to a file named person.ser. Use 
//ObjectOutputStream for serialization.
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Program1 {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Varadraj", 21);

        FileOutputStream fos = new FileOutputStream("person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p);

        oos.close();
        fos.close();

        System.out.println("Object Serialized");
    }
}

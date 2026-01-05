
//Write a Java program to serialize an object of a class Person with fields 
//name and age and write it to a file named person.ser. Use 
//ObjectOutputStream for serialization.

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    String name;
    int rollNo;

    Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Program1 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Varadraj", 56);
        FileOutputStream fos = new FileOutputStream("person.ser");
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        obj.writeObject(p);
        obj.close();
        fos.close();
        System.out.println("Object serialized....");
    }
}

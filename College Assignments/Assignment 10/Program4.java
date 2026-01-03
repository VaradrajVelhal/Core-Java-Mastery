//Write a Java program to copy the contents of one file named source.txt to
//another file named destination.txt. Use FileInputStream and
//FileOutputStream to perform the copy operation.

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program4 {
    public static void main(String[] args) {
        FileInputStream in;
        FileOutputStream out;
        try {
            in = new FileInputStream("source.txt");
            out = new FileOutputStream("destination.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
            System.out.println("file copied sucessfully....");
        } catch (Exception e) {
            System.out.println("error occured....");
        }
    }
}
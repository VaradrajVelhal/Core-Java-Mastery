
//Write a Java program to display the size and properties of a file named
//example.txt. Use the File class to retrieve and display the file size, last
//modified date, and whether it is a directory or a file.
import java.io.File;
import java.util.Date;

public class Program9 {
    public static void main(String[] args) {
        // Create File object
        File f = new File("example.txt");

        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("Size: " + f.length() + " bytes");

            // Convert timestamp to readable date
            System.out.println("Last Modified: " + new Date(f.lastModified()));

            // Check type
            if (f.isFile()) {
                System.out.println("Type: File");
            } else if (f.isDirectory()) {
                System.out.println("Type: Directory");
            }
        } else {
            System.out.println("File 'example.txt' does not exist.");
        }
    }
}

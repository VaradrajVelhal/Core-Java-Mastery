
//Write a Java program to check if a file named data.txt exists in the current
//directory.Print a message indicating whether the file exists or not using the File class.
import java.io.File;

public class Program5 {
    public static void main(String[] args) {
        // Create a File object (does not create the file on disk, just the link)
        File file = new File("data.txt");

        // Check if it actually exists
        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("Path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}

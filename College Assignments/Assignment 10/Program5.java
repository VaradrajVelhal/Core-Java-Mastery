
//Write a Java program to check if a file named data.txt exists in the current
//directory.Print a message indicating whether the file exists or not using the File class.
import java.io.File;

public class Program5 {
    public static void main(String[] args) {
        File f = new File("source.txt");
        if (f.exists()) {
            System.out.println("file exists " + f.getAbsolutePath());
        } else {
            System.out.println("file not found.");
        }
    }
}
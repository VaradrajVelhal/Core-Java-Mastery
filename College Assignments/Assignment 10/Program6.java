
//Write a Java program to delete a file named oldfile.txt from the file
//system. Use the File class to delete the file and print a message indicating
//success or failure.
import java.io.File;

public class Program6 {
    public static void main(String[] args) {
        File f = new File("oldfile.txt");

        if (f.delete()) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Failed to delete (file might not exist)");
        }
    }
}
// Failed to delete (file might not exist)

//Write a Java program to rename a file named temp.txt to newfile.txt. Use
//the File class to perform the renaming operation.
import java.io.File;

public class Program7 {
    public static void main(String[] args) {
        File oldFile = new File("temp.txt");
        File newFile = new File("newfile.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("Renamed successfully");
        } else {
            System.out.println("Rename failed");
        }
    }
}

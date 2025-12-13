
//Write a Java program to list all the files and directories in a specified
//directory. Use the File class to get the list of files and directories and print their names.
import java.io.File;

public class Program8 {
    public static void main(String[] args) {
        // "." represents the current directory
        File dir = new File(".");

        // Get list of file/directory names as strings
        String[] fileList = dir.list();

        if (fileList != null) {
            System.out.println("Files in current directory:");
            for (String name : fileList) {
                System.out.println(name);
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}

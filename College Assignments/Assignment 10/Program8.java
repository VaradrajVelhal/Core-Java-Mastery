
//Write a Java program to list all the files and directories in a specified
//directory. Use the File class to get the list of files and directories and print their names.
import java.io.File;

public class Program8 {
    public static void main(String[] args) {
        // "." represents the current directory
        File f = new File(".");
        String list[] = f.list();
        if (list != null) {
            System.out.println("Here are your files....");
            for (String string : list) {
                System.out.println(string);
            }
        } else {
            System.out.println("there are no files here.");
        }
    }
}
// op
// log.txt
// Program3.java
// Program6.class
// Program2.class
// Program2.java
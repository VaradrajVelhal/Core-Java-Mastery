//Write a Java program to use the Path and Files classes to copy a file from 
//one location to another. Handle any potential exceptions during the copy  operation.

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class Program6 {
    public static void main(String[] args) {

        Path source = Paths.get("source.txt");
        Path dest = Paths.get("copy.txt");

        try {
            Files.copy(source, dest);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error while copying file");
        }
    }
}

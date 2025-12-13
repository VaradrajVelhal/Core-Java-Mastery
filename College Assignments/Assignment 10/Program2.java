
//Write a Java program to read the contents of a text file named input.txt and
//print it to the console. Use FileReader and BufferedReader to perform the
//read operation.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {
        try {
            // Create reader buffer
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String line;
            // Loop through the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error: File not found or couldn't be read.");
        }
    }
}

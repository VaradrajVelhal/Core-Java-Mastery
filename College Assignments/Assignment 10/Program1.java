
//Write a Java program to create a text file named output.txt and write some
//text into it. Use FileWriter and BufferedWriter to perform the write operation.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Program1 {
    public static void main(String[] args) {
        try {
            // Create file and buffer
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Write text
            writer.write("Hello! This is written using Java.");
            writer.newLine(); // Adds a new line
            writer.write("BufferedWriter makes writing efficient.");

            writer.close(); // Important to save changes
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
// op File written successfully.

//Write a Java program to append text to an existing file named log.txt. Use
//FileWriter in append mode and BufferedWriter to append additional lines
//of text.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        try {
            // The 'true' argument enables append mode
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));

            writer.write(" - New log entry added.");
            writer.newLine(); // Move to next line

            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}
// op Text appended successfully.
//Write a Java program to copy the contents of one file named source.txt to
//another file named destination.txt. Use FileInputStream and
//FileOutputStream to perform the copy operation.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // Open the source file for reading
            in = new FileInputStream("source.txt");

            // Open (or create) the destination file for writing
            out = new FileOutputStream("destination.txt");

            int c;
            // Read byte by byte until the end of the file (-1)
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        } finally {
            // Always close streams to avoid memory leaks
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException e) {
                System.out.println("Error closing stream.");
            }
        }
    }
}

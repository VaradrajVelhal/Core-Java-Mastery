
//Write a Java program to read the contents of a text file named input.txt and
//print it to the console. Use FileReader and BufferedReader to perform the
//read operation.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program2 {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
//Write a Java program that handles FileNotFoundException and 
//IOException while performing file read and write operations. Include 
//appropriate error messages in the catch blocks.

import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class Program3 {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello File");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input or Output error");
        }
    }
}

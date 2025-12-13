// Write a Java program to read a file named data.csv line by line and print
//each line to the console. Use BufferedReader and handle any potential exceptions.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program10 {
    public static void main(String[] args) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            while ((line = br.readLine()) != null) {
                // formatting nicely with commas
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
// op
// roll,name
// 1,Varadraj
// 2,Ganesh

//Write a Java program to read data from a CSV file named contacts.csv and 
//write data to a new CSV file named contacts_copy.csv. Use FileReader, 
//BufferedReader, FileWriter, and BufferedWriter.

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Program9 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("contacts.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("contacts_copy.csv"));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("CSV file copied");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}

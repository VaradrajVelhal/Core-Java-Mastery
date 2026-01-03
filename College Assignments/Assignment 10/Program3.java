
//Write a Java program to append text to an existing file named log.txt. Use
//FileWriter in append mode and BufferedWriter to append additional lines
//of text.
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program3 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
        bw.append("-appending this text to file");
        bw.newLine();
        bw.append("-done with appending.");
        bw.close();
        System.out.println("sucessful..");
    }
}
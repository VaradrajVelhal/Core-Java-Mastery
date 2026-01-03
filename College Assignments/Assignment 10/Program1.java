
//Write a Java program to create a text file named output.txt and write some
//text into it. Use FileWriter and BufferedWriter to perform the write operation.
import java.io.BufferedWriter;
import java.io.FileWriter;

class Program1 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("I am Varadraj Velhal....");
        bw.write("\nI am from Maharashtra....");
        bw.close();
        System.out.println("file written sucessfully.");
    }
}
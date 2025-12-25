
//Write a Java program to use BufferedInputStream and BufferedOutputStream to read from and write to binary files.Demonstrate how buffered streams can improve performance.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

class Program7 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("input.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("output.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();

            System.out.println("Binary file copied using buffered streams");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}

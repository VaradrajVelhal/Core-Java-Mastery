
//Write a Java program to use java.nio.file package to read the contents of a 
//file named sample.txt using Files.readAllLines(). Print the contents to the  console.
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

class Program4 {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("sample.txt"));

        for (String line : lines) {
            System.out.println(line);
        }
    }
}

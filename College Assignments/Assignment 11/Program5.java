//Write a Java program to create a directory named newdir, and then create a file named file.txt inside this directory. Write some text to the file and read it back.

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

class Program5 {
    public static void main(String[] args) throws Exception {

        File dir = new File("newdir");
        dir.mkdir();

        File file = new File("newdir/file.txt");

        FileWriter fw = new FileWriter(file);
        fw.write("Hello Java");
        fw.close();

        FileReader fr = new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}

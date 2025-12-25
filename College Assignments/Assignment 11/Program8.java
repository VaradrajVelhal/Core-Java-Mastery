//Write a Java program to use FileChannel to read data from and write data 
//to a file named data.bin. Use FileChannel's methods for efficient file I/O  operations

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class Program8 {
    public static void main(String[] args) throws Exception {

        RandomAccessFile file = new RandomAccessFile("data.bin", "rw");
        FileChannel channel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Hello FileChannel".getBytes());
        buffer.flip();
        channel.write(buffer);

        buffer.clear();
        channel.position(0);
        channel.read(buffer);
        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }

        channel.close();
        file.close();
    }
}

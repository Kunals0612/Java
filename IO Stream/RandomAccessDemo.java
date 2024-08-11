import java.io.*;
public class RandomAccessDemo {
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf = new RandomAccessFile("Data.txt", "rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('x');
        System.out.println((char)rf.read());
        rf.skipBytes(2);
        System.out.println((char)rf.read());
        rf.seek(2);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        System.out.println((char)rf.read());
        rf.seek(rf.getFilePointer()+3);
        System.out.println((char)rf.read());
        rf.close();
    }
}

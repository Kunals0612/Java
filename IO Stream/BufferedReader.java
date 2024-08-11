import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class BufferedReader {
    public static void main(String[] args) throws Exception
    {
         FileInputStream fin = new FileInputStream("Test.txt");
         BufferedInputStream bis = new BufferedInputStream(fin);
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.mark(10);
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.reset();
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.reset();
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.close();
    }
}

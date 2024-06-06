import java.io.*;
public class DataInputStrm {
    public static void main(String[] args)
    throws IOException
    {
       DataInputStream reader = new DataInputStream(System.in);
       int integer = Integer.parseInt(reader.readLine());
       System.out.println(integer);
    }
}

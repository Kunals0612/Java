import java.io.*;
// import java.util.zip.InflaterOutputStream;
public class BufferReader{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(str);
        int i = Integer.parseInt(bf.readLine());
        System.out.println(i);
    }
}
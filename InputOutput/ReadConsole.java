import java.io.*;
public class ReadConsole {
    public static void main(String[] args)
      throws IOException
    {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        String name = bf.readLine();
        System.out.println(name);
    }
}
